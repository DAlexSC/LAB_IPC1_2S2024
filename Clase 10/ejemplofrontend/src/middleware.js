import { NextResponse } from 'next/server'

// This function can be marked `async` if using `await` inside
export function middleware(request) {

  const cookies = request.cookies;
  const tipoUsuario = cookies.get('tipo_usuario')?.value;
  const url = request.nextUrl.pathname;

  if (!tipoUsuario) {
    return NextResponse.redirect(new URL('/login', request.url))
  } else if (tipoUsuario && tipoUsuario === 'administrador' && !url.startsWith('/menu_administracion')) {
    return NextResponse.redirect(new URL('/menu_administracion', request.url))
  } else if (tipoUsuario && tipoUsuario === 'vendedor' && !url.startsWith('/menu_venta')) {
    return NextResponse.redirect(new URL('/menu_venta', request.url))
  } else if (tipoUsuario && url.startsWith('/login')) {
    if (tipoUsuario === 'administrador') {
      return NextResponse.redirect(new URL('/menu_administracion', request.url));
    } else if (tipoUsuario === 'vendedor') {
      return NextResponse.redirect(new URL('/menu_venta', request.url));
    }
  } else {
    return NextResponse.next();
  }
}

// See "Matching Paths" below to learn more
export const config = {
  matcher: ['/menu_administracion/:path*', '/menu_venta/:path*'],
}
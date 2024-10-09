'use client'
import { Navbar, Container, Nav } from "react-bootstrap";
import { useRouter } from 'next/navigation';

export default function MenuAdministracionLayout({ children }) {

    const router = useRouter();

    // handle para eliminar una cookie
    const handleLogout = () => {

        document.cookie = "tipo_usuario=;";
        document.cookie = "usuario=;";
        router.push("/login");
    }

    return (
        <>
            <Navbar bg="dark" data-bs-theme="dark" className="bg-body-tertiary">
                <Container>
                    <Navbar.Brand href="#home">Mi Tiendita</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link onClick={() => router.push('/menu_administracion/producto')}>Producto</Nav.Link>
                        <Nav.Link onClick={() => router.push('/menu_administracion/inventario')}>Inventario</Nav.Link>
                    </Nav>
                    <Nav>
                        <Nav.Link onClick={handleLogout}>Cerrar Sesion</Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
            {children}
        </>
    )
}
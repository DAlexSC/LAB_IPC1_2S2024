'use client'
import { Container, Row, Col, Form, Button } from "react-bootstrap";
import { useRouter } from 'next/navigation';

export default function Login() {

    const router = useRouter();

    const handleSubmit = async (e) => {

        e.preventDefault();

        try {

            // Se crea un cookie con el tipo de usuario y el usuario
            document.cookie = "tipo_usuario=administrador";
            document.cookie = "usuario=" + e.target.formBasicUserName.value;
            router.push("/menu_administracion");

        } catch (error) {
            // handleAxiosError(error);
        }
    };

    return (
        <Container fluid className="vh-100 d-flex justify-content-center align-items-center">
            <Row>
                <Col>
                    <Form onSubmit={handleSubmit}>
                        <Form.Group className="mb-3" controlId="formBasicUserName">
                            <Form.Label>Usuario</Form.Label>
                            <Form.Control type="text" placeholder="Usuario" />
                        </Form.Group>

                        <Form.Group className="mb-3" controlId="formBasicContrasenia">
                            <Form.Label>Contraseña</Form.Label>
                            <Form.Control type="password" placeholder="Contraseña" />
                        </Form.Group>
                        <Button variant="primary" type="submit">
                            Iniciar sesion
                        </Button>
                    </Form>
                </Col>
            </Row>
        </Container>
    );
}

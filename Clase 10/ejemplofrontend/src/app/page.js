import { Container, Row, Col } from "react-bootstrap";

export default function Home() {
  return (
    <Container fluid className="vh-100 d-flex justify-content-center align-items-center">
      <Row>
        <Col>
          <h1>Hola mundo</h1>
        </Col>
      </Row>
    </Container>
  );
}

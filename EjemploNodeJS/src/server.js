const express = require('express');
const app = express();
const profesoresRoutes = require('./profesores');  // Importar las rutas de profesores
const estudiantesRoutes = require('./estudiantes');  // Importar las rutas de estudiantes

const port = 3000;

// Middleware para parsear JSON en las solicitudes
app.use(express.json());

// Montar las rutas en el servidor
app.use('/profesores', profesoresRoutes);  // Ruta base para profesores
app.use('/estudiantes', estudiantesRoutes);  // Ruta base para estudiantes

// Manejo de ruta no encontrada (404)
app.use((req, res) => {
  res.status(404).json({ message: 'Ruta no encontrada' });
});

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});
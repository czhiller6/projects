package com.example.exercise;

import java.io.FileNotFoundException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.simple.JSONObject;

/**
 * Endpoint 
 *
 */
@Path("/extService")
@Stateless
public class ExternalRestServiceImpl {
    
  
    /**
     * Help.
     *
     * @param json
     *            the json
     * @return the response
     * @throws FileNotFoundException
     *             the file not found exception
     */
    @POST
    @Path("/help")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response help(final JSONObject json) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder(2000);
        sb.append("String getTipoConvenio(String subProducto);").append("\n\n");
        sb.append("String getCodigoCargoFuncion(String ocupacion, String fechaNac, boolean isEstudiante);").append(
                "\n\n");
        sb.append("String getCodigoPaquete(String tipoConvenio);").append("\n\n");
        sb.append("String getCodigoPromocion(String tipoConvenio);").append("\n\n");
        sb.append("String getTipoEmpresa(String ocupacion);").append("\n\n");
        sb.append("boolean isResideEnElPais(String pais);").append("\n\n");
        sb.append("String getSectorPersona(String nacionalidad);").append("\n\n");
        sb.append("String getCodigoNivelEstudios(String fechaNac, boolean isEstudiante);").append("\n\n");
        sb.append("String getCodigoProfesion(String ocupacion, String fechaNac, boolean isEstudiante);").append("\n\n");
        sb.append("String getCodigoTituloObtenido(String fechaNac, boolean isEstudiante);").append("\n\n");
        sb.append("String getRolUniversidad(String fechaNac, boolean isEstudiante);").append("\n\n");
        sb.append("String getRioCash(boolean isflujoPrincipal);").append("\n\n");
        sb.append("String getTipoParticipante(String tipoParticipante);").append("\n\n");
        sb.append("String getFechaInicioActividades(String ocupacion);").append("\n\n");
        sb.append("String getFechaIngreso(String ocupacion);").append("\n\n");
        
        return this.createResponse(sb.toString());
    }
    
    
    /**
     * Creates a response with an object dto.
     *
     * @param dto
     *            the dto
     * @return response
     */
    public Response createResponse(Object dto) {
        ResponseBuilder builder = Response.ok(dto);
        return builder.build();
    }
    
}

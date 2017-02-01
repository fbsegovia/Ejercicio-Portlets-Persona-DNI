package portlets;

import java.io.IOException;
import java.util.List;

import javax.ccpp.SetAttribute;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import modelo.entidades.Persona;
import modelo.negocio.GestorPersonas;

public class DetallePortlet extends GenericPortlet{

	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		
		GestorPersonas gp = new GestorPersonas();
		String dni=request.getParameter("dni");
		if(dni==null){
			
			List<Persona> listaPersonas = gp.getListaPersonas();
			
			request.setAttribute("listaPersonas", listaPersonas);
			
			PortletRequestDispatcher prd = 
					getPortletContext()
					.getRequestDispatcher("/jsp/tablaPersonas_view.jsp");
			prd.include(request, response);
		}else{
			Persona p=gp.buscarPorDNI(dni);
			request.setAttribute("persona", p);
			PortletRequestDispatcher prd = 
					getPortletContext()
					.getRequestDispatcher("/jsp/tablaDetalle_view.jsp");
			prd.include(request, response);			
		}
	}
	
	@Override
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
		String dni=request.getParameter("dni");
		if(dni!=null){
			response.setRenderParameter("dni", dni);
		}	
	}
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import javax.servlet.http.*;
import java.io.*;
/**
 *
 * @author hp
 */
public class HelloServletTest {
    
    @Test
    public void testHelloServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);

        when(response.getWriter()).thenReturn(writer);

        HelloServlet servlet = new HelloServlet();
        servlet.doGet(request, response);

        verify(writer).write("Hello, World!");
    }
    
}

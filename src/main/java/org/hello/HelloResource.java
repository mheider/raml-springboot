package org.hello;

import org.hello.model.Message;
import org.hello.resource.Hello;

/**
 * Created by apires1 on 02/06/2015.
 */
public class HelloResource implements Hello {

    @Override
    public GetHelloResponse getHello() throws Exception {
        return GetHelloResponse.withJsonOK(new Message().withText("Hello World!"));
    }

    @Override
    public PutHelloResponse putHello(Message entity) throws Exception {
        return null;
    }

    @Override
    public PatchHelloResponse patchHello(Message entity) throws Exception {
        return null;
    }

    @Override
    public DeleteHelloResponse deleteHello() throws Exception {
        return null;
    }
}

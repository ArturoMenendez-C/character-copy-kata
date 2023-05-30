import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class CopierShould {

    @Test
    void read_characters_from_the_source_and_copy_them_to_destination(){
        Source source = new SourceStub();
        DestinationSpy destination = new DestinationSpy();

        Copier copier = new Copier(source, destination);
        copier.copy();

        assertTrue(destination.setCharmethodHasBeenCalled);
    }

}
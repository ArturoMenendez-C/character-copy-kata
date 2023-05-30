public class DestinationSpy implements Destination {
    public boolean setCharmethodHasBeenCalled;

    @Override
    public void setChar(char character) {
        setCharmethodHasBeenCalled = true;
    }
}

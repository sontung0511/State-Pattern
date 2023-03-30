class AvailableState implements DiscState {
    @Override
    public void rent(Disc disc) {
        disc.setState(new RentedState());
        System.out.println("Disc rented: " + disc.getTitle());
    }

    @Override
    public void returnDisc(Disc disc) {
        System.out.println("The disc is already available!");
    }
}
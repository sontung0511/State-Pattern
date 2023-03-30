class RentedState implements DiscState {
    @Override
    public void rent(Disc disc) {
        System.out.println("The disc is already rented!");
    }

    @Override
    public void returnDisc(Disc disc) {
        disc.setState(new AvailableState());
        System.out.println("Disc returned: " + disc.getTitle());
    }
}
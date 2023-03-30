// Context class
class Disc {
    private String title;
    private DiscState state;

    public Disc(String title) {
        this.title = title;
        this.state = new AvailableState();
    }

    public void setState(DiscState state) {
        this.state = state;
    }

    public void rent() {
        state.rent(this);
    }

    public void returnDisc() {
        state.returnDisc(this);
    }

    public String getTitle() {
        return title;
    }
}



public class Mobile {

    interface Printable
    {
        String print(Mobile mobile);
    }

    interface BuilderInterface
    {
        Mobile build();
        BuilderInterface setModel(String model);
        BuilderInterface setPrice(int price);
        BuilderInterface setMemory(int memory);
        BuilderInterface setCamera(int camera);
    }


    private String model;
    private int price, memory, camera;


    static class BuilderInnerStatic
    {
        String model;
        int price;
        int memory;
        int camera;

        private BuilderInnerStatic setModel(String model)
        {
            this.model = model;
            return this;
        }

        private BuilderInnerStatic setPrice(int price)
        {
            this.price = price;
            return this;
        }

        private BuilderInnerStatic setMemory(int memory)
        {
            this.memory = memory;
            return this;
        }

        private BuilderInnerStatic setCamera(int camera)
        {
            this.camera = camera;
            return this;
        }

        Mobile build()
        {
            Mobile mobile = new Mobile();
            mobile.model = model;
            mobile.memory = memory;
            mobile.price = price;
            mobile.camera = camera;
            return mobile;
        }
    }


    class BuilderInner
    {
        String model;
        int price;
        int memory;
        int camera;

        private BuilderInner setModel(String model)
        {
            this.model = model;
            return this;
        }

        private BuilderInner setPrice(int price)
        {
            this.price = price;
            return this;
        }

        private BuilderInner setMemory(int memory)
        {
            this.memory = memory;
            return this;
        }

        private BuilderInner setCamera(int camera)
        {
            this.camera = camera;
            return this;
        }

        Mobile build()
        {
            Mobile.this.model = model;
            Mobile.this.memory = memory;
            Mobile.this.price = price;
            Mobile.this.camera = camera;
            return Mobile.this;
        }
    }


    public Mobile fill(String model, int price, int memory, int camera)
    {
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.camera = camera;
        return this;
    }


    public Mobile fillNestedInner(String model, int price, int memory, int camera)
    {
        BuilderInner builderInner = new BuilderInner();
        return builderInner.setModel(model).setPrice(price).setMemory(memory).setCamera(camera).build();
    }

    public Mobile fillStaticInner(String model, int price, int memory, int camera)
    {
        BuilderInnerStatic builderInnerStatic = new BuilderInnerStatic();
        return builderInnerStatic.setModel(model).setPrice(price).setMemory(memory).setCamera(camera).build();
    }

    public Mobile fillLocalInner(String model, int price, int memory, int camera)
    {
        class BuilderLocalInner
        {
            private String model;
            private int price;
            private int memory;
            private int camera;

            private BuilderLocalInner setModel(String model)
            {
                this.model = model;
                return this;
            }

            private BuilderLocalInner setPrice(int price)
            {
                this.price = price;
                return this;
            }

            private BuilderLocalInner setMemory(int memory)
            {
                this.memory = memory;
                return this;
            }

            private BuilderLocalInner setCamera(int camera)
            {
                this.camera = camera;
                return this;
            }

            private Mobile build()
            {
                Mobile.this.model = model;
                Mobile.this.memory = memory;
                Mobile.this.price = price;
                Mobile.this.camera = camera;
                return Mobile.this;
            }
        }
        BuilderLocalInner builderLocalInner = new BuilderLocalInner();
        return builderLocalInner.setModel(model).setPrice(price).setMemory(memory).setCamera(camera).build();
    }


    public Mobile fillAnonymousInner(String model, int price, int memory, int camera)
    {
        return new BuilderInterface()
        {
            String model;
            int price;
            int memory;
            int camera;

            public BuilderInterface setModel(String model)
            {
                this.model = model;
                return this;
            }

            public BuilderInterface setPrice(int price)
            {
                this.price = price;
                return this;
            }

            public BuilderInterface setMemory(int memory)
            {
                this.memory = memory;
                return this;
            }

            public BuilderInterface setCamera(int camera)
            {
                this.camera = camera;
                return this;
            }

            public Mobile build()
            {
                Mobile.this.model = model;
                Mobile.this.memory = memory;
                Mobile.this.price = price;
                Mobile.this.camera = camera;
                return Mobile.this;
            }
        }.setModel(model).setPrice(price).setMemory(memory).setCamera(camera).build();
    }


    private String getMobile()
    {
        return model;
    }

    public void setMobile(String model)
    {
        this.model = model;
    }

    private int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    private int getMemory()
    {
        return memory;
    }

    public void setMemory(int memory)
    {
        this.memory = memory;
    }

    private int getCamera()
    {
        return camera;
    }

    public void setCamera(int camera)
    {
        this.camera = camera;
    }

    @Override
    public String toString()
    {
        return "Телефон" + " " + getMobile() + ": Цена:" + getPrice() + "$, память: "
                + getMemory() + " Гб, камера: " + getCamera() + " Мп";
    }

    public String toStringInner()
    {
        return new Mobile.Info().print();
    }

    public String toStringLocalInner()
    {
        class LocalInner
        {
            private String print(Mobile mobile)
            {
                return "Телефон" + " " + getMobile( mobile) + ": Цена:" + getPrice( mobile) + "$, память: "
                        + getMemory( mobile) + " Гб, камера: " + getCamera( mobile) + " Мп";
            }

            private String getMobile(Mobile mobile)
            {
                return mobile.getMobile();
            }

            private int getMemory(Mobile mobile)
            {
                return mobile.getMemory();
            }

            private int getPrice(Mobile mobile)
            {
                return mobile.getPrice();
            }

            private int getCamera(Mobile mobile)
            {
                return mobile.camera;
            }
        }
        LocalInner localInner = new LocalInner();
        return localInner.print(Mobile.this);
    }

    public String toStringAnonymousInner()
    {
        return new Mobile.Printable(){
            @Override
            public String print(Mobile mobile)
            {
                return "Телефон" + " " + getMobile(mobile) + ": Цена:" + getPrice(mobile) + "$, память: "
                        + getMemory(mobile) + " Гб, камера: " + getCamera(mobile) + " Мп";
            }

            private String getMobile(Mobile mobile)
            {
                return mobile.getMobile();
            }

            private int getMemory(Mobile mobile)
            {
                return mobile.getMemory();
            }

            private int getPrice(Mobile mobile)
            {
                return mobile.getPrice();
            }

            private int getCamera(Mobile mobile)
            {
                return mobile.camera;
            }

        }.print(Mobile.this);
    }

    public String toStringStaticInner()
    {
        return new Mobile.MobilePrint().print(this);
    }

    static class MobilePrint
    {
        String print(Mobile mobile)
        {
            return "Телефон" + " " +  getMobile(mobile) + ": Цена:" + getPrice(mobile) + "$, память: "
                    + getMemory(mobile) + " Гб, камера: " + getCamera(mobile) + " Мп";
        }

        private String getMobile(Mobile mobile)
        {
            return mobile.getMobile();
        }

        private int getMemory(Mobile mobile)
        {
            return mobile.getMemory();
        }

        private int getPrice(Mobile mobile)
        {
            return mobile.getPrice();
        }

        private int getCamera(Mobile mobile)
        {
            return mobile.camera;
        }
    }


    private class Info
    {
        String model;
        int price, memory, camera;

        Info()
        {
            this.model = Mobile.this.model;
            this.price = Mobile.this.price;
            this.memory = Mobile.this.memory;
            this.camera = Mobile.this.camera;
        }

        String print()
        {
            return "Телефон" + " " + getMobile() + ": Цена:" + getPrice() + "$, память: "
                    + getMemory() + " Гб, камера: " + getCamera() + " Мп";

        }

        private String getMobile()
        {
            return model;
        }

        private int getPrice()
        {
            return price;
        }

        private int getMemory()
        {
            return memory;
        }

        private int getCamera()
        {
            return camera;
        }
    }
}

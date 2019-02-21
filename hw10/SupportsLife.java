package hw10;

public  class SupportsLife implements Planet{  
    /* 
         In this class,there are many methods which are not applicable to cashier because 
         it is a leaf node. 
     */  
        private int sceneNum;  
            private String name;  
        private float size;  
        public SupportsLife(int sceneNum,String name,float size)  {  
            this.sceneNum = sceneNum;  
            this.name = name;  
            this.size = size;  
        }  
        @Override  
        public void add(Planet planet) {  
            //this is leaf node so this method is not applicable to this class.  
        }  
        @Override  
        public Planet getChild(int i) {  
            //this is leaf node so this method is not applicable to this class.  
            return null;  
        }  
        @Override  
        public int getSceneNum() {  
            // TODO Auto-generated method stub  
            return sceneNum;  
        }  
        @Override  
        public String getName() {  
            return name;  
        }  
        @Override  
        public float getSize() {  
            return size;  
        }  
        @Override  
        public void print() {  
            System.out.println("==========================");  
            System.out.println("Scene = "+getSceneNum());  
            System.out.println("Name = "+getName());  
            System.out.println("Size = "+getSize());  
            System.out.println("==========================");  
        }  
        @Override  
        public void remove(Planet planet) {  
            //this is leaf node so this method is not applicable to this class.  
        }  
}  
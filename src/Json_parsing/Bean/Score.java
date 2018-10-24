package Json_parsing.Bean;

public class Score {
    private String scoreId;
    private Double Networkprotocol;//网络协议
    private Double javaEE;
    private Double Computerbasis;//计算机基础
    private Double Linuxoperatingsystem;//Linux操作系统
    private Double networksecurity;//网络安全
    private Double SQLdatabase;//Sql数据库
    private Double datastructure;//数据结构

    public Score() {

        // TODO Auto-generated constructor stub
    }

    public Score(String scoreId, Double networkprotocol, Double javaEE, Double computerbasis,
                 Double linuxoperatingsystem, Double networksecurity, Double sQLdatabase, Double datastructure) {
        super();
        this.scoreId = scoreId;
        Networkprotocol = networkprotocol;
        this.javaEE = javaEE;
        Computerbasis = computerbasis;
        Linuxoperatingsystem = linuxoperatingsystem;
        this.networksecurity = networksecurity;
        SQLdatabase = sQLdatabase;
        this.datastructure = datastructure;
    }

    public String getScoreId() {
        return scoreId;
    }
    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }
    public Double getNetworkprotocol() {
        return Networkprotocol;
    }
    public void setNetworkprotocol(Double networkprotocol) {
        Networkprotocol = networkprotocol;
    }
    public Double getJavaEE() {
        return javaEE;
    }
    public void setJavaEE(Double javaEE) {
        this.javaEE = javaEE;
    }
    public Double getComputerbasis() {
        return Computerbasis;
    }
    public void setComputerbasis(Double computerbasis) {
        Computerbasis = computerbasis;
    }
    public Double getLinuxoperatingsystem() {
        return Linuxoperatingsystem;
    }
    public void setLinuxoperatingsystem(Double linuxoperatingsystem) {
        Linuxoperatingsystem = linuxoperatingsystem;
    }
    public Double getNetworksecurity() {
        return networksecurity;
    }
    public void setNetworksecurity(Double networksecurity) {
        this.networksecurity = networksecurity;
    }
    public Double getSQLdatabase() {
        return SQLdatabase;
    }
    public void setSQLdatabase(Double sQLdatabase) {
        SQLdatabase = sQLdatabase;
    }
    public Double getDatastructure() {
        return datastructure;
    }
    public void setDatastructure(Double datastructure) {
        this.datastructure = datastructure;
    }
    @Override
    public String toString() {
        return "Score [scoreId=" + scoreId + ", Networkprotocol=" + Networkprotocol + ", javaEE=" + javaEE
                + ", Computerbasis=" + Computerbasis + ", Linuxoperatingsystem=" + Linuxoperatingsystem
                + ", networksecurity=" + networksecurity + ", SQLdatabase=" + SQLdatabase + ", datastructure="
                + datastructure + "]";
    }
}

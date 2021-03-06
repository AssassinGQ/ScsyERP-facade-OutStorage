package cn.AssassinG.ScsyERP.OutStorage.facade.entity;

import cn.AssassinG.ScsyERP.OutStorage.facade.enums.OutStorageFormStatus;
import cn.AssassinG.ScsyERP.common.annitations.Valid;
import cn.AssassinG.ScsyERP.common.entity.FormEntity;
import cn.AssassinG.ScsyERP.common.enums.AccountStatus;
import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OutStorageForm extends FormEntity {
    private static final long serialVersionUID = 8400459278449181844L;
    @Valid(varType = Valid.VarType.Number)
    private Long Project;
    @Valid(varType = Valid.VarType.Other)
    private OutStorageFormStatus OutStorageStatus;
    private String OutStorageNumber;
    @Valid(varType = Valid.VarType.Other)
    private Date OutStorageTime;
    @Valid(varType = Valid.VarType.Number)
    private Long Warehouse;
    @Valid(varType = Valid.VarType.Number)
    private Long Truck;
    @Valid(varType = Valid.VarType.Number)
    private Long PickWorker;
    @Valid(varType = Valid.VarType.Number)
    private Long Lister;
    private Set<Long> DriveWorkers;//弃用，join查询warehouse中的，complete时也根据warehouse中的来
    private Set<Long> LiftWorkers;//弃用
    private AccountStatus AccountStatus;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 9999)
    private Integer TotalAmount;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 99999)
    private Double TotalVolume;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 99999)
    private Double TotalWeight;
    private Set<Long> Products;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 999999)
    private Double RealOutStorageWeight;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 999999)
    private Double DriveWorkerAverageWeight;
    @Valid(varType = Valid.VarType.Number, nullAble = true, maxValue = 999999)
    private Double LiftWorkerAverageWeight;

    public OutStorageForm() {
        super();
    }

    public Long getProject() {
        return Project;
    }

    public void setProject(Long project) {
        Project = project;
    }

    @JSONField(serialize = false)
    public OutStorageFormStatus getOutStorageStatus() {
        return OutStorageStatus;
    }

    @JSONField(deserialize = false)
    public void setOutStorageStatus(OutStorageFormStatus outStorageStatus) {
        OutStorageStatus = outStorageStatus;
    }

    @JSONField(name = "outStorageStatus")
    public String getOutStorageFormStatusName(){
        if(OutStorageStatus != null)
            return this.OutStorageStatus.getName();
        else
            return "";
    }

    @JSONField(name = "outStorageStatus")
    public void setOutStorageFormStatusName(String name){
        this.OutStorageStatus = OutStorageFormStatus.getEnum(name);
    }

    public String getOutStorageNumber() {
        return OutStorageNumber;
    }

    public void setOutStorageNumber(String outStorageNumber) {
        OutStorageNumber = outStorageNumber;
    }

    public Date getOutStorageTime() {
        return OutStorageTime;
    }

    public void setOutStorageTime(Date outStorageTime) {
        OutStorageTime = outStorageTime;
    }

    public Long getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(Long warehouse) {
        Warehouse = warehouse;
    }

    public Long getTruck() {
        return Truck;
    }

    public void setTruck(Long truck) {
        Truck = truck;
    }

    public Long getPickWorker() {
        return PickWorker;
    }

    public void setPickWorker(Long pickWorker) {
        PickWorker = pickWorker;
    }

    public Long getLister() {
        return Lister;
    }

    public void setLister(Long lister) {
        Lister = lister;
    }

    public Set<Long> getDriveWorkers() {
        return DriveWorkers;
    }

    public void setDriveWorkers(Set<Long> driveWorkers) {
        if(driveWorkers == null)
            this.DriveWorkers = new HashSet<>();
        else
            DriveWorkers = driveWorkers;
    }

    public Set<Long> getLiftWorkers() {
        return LiftWorkers;
    }

    public void setLiftWorkers(Set<Long> liftWorkers) {
        if(liftWorkers == null)
            this.LiftWorkers = new HashSet<>();
        else
            LiftWorkers = liftWorkers;
    }

    @JSONField(serialize = false)
    public cn.AssassinG.ScsyERP.common.enums.AccountStatus getAccountStatus() {
        return AccountStatus;
    }

    @JSONField(deserialize = false)
    public void setAccountStatus(cn.AssassinG.ScsyERP.common.enums.AccountStatus accountStatus) {
        AccountStatus = accountStatus;
    }

    @JSONField(name = "accountStatus")
    public String getAccountStatusName(){
        if(AccountStatus != null)
            return this.AccountStatus.getName();
        else
            return "";
    }

    @JSONField(name = "accountStatus")
    public void setAccountStatusName(String name){
        this.AccountStatus = cn.AssassinG.ScsyERP.common.enums.AccountStatus.getEnum(name);
    }

    public Integer getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        TotalAmount = totalAmount;
    }

    public Double getTotalVolume() {
        return TotalVolume;
    }

    public void setTotalVolume(Double totalVolume) {
        TotalVolume = totalVolume;
    }

    public Double getTotalWeight() {
        return TotalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        TotalWeight = totalWeight;
    }

    public Set<Long> getProducts() {
        return Products;
    }

    public void setProducts(Set<Long> products) {
        if(products == null)
            Products = new HashSet<>();
        else
            Products = products;
    }

    public Double getRealOutStorageWeight() {
        return RealOutStorageWeight;
    }

    public void setRealOutStorageWeight(Double realOutStorageWeight) {
        RealOutStorageWeight = realOutStorageWeight;
    }

    public Double getDriveWorkerAverageWeight() {
        return DriveWorkerAverageWeight;
    }

    public void setDriveWorkerAverageWeight(Double driveWorkerAverageWeight) {
        DriveWorkerAverageWeight = driveWorkerAverageWeight;
    }

    public Double getLiftWorkerAverageWeight() {
        return LiftWorkerAverageWeight;
    }

    public void setLiftWorkerAverageWeight(Double liftWorkerAverageWeight) {
        LiftWorkerAverageWeight = liftWorkerAverageWeight;
    }

    @Override
    public String toString() {
        return "OutStorageForm{" +
                "Project=" + Project +
                ", OutStorageStatus=" + OutStorageStatus +
                ", OutStorageNumber='" + OutStorageNumber + '\'' +
                ", OutStorageTime=" + OutStorageTime +
                ", Warehouse=" + Warehouse +
                ", Truck=" + Truck +
                ", PickWorker=" + PickWorker +
                ", Lister=" + Lister +
                ", DriveWorkers=" + DriveWorkers +
                ", LiftWorkers=" + LiftWorkers +
                ", AccountStatus=" + AccountStatus +
                ", TotalAmount=" + TotalAmount +
                ", TotalVolume=" + TotalVolume +
                ", TotalWeight=" + TotalWeight +
                ", Products=" + Products +
                ", RealOutStorageWeight=" + RealOutStorageWeight +
                ", DriveWorkerAverageWeight=" + DriveWorkerAverageWeight +
                ", LiftWorkerAverageWeight=" + LiftWorkerAverageWeight +
                ", IfCompleted=" + IfCompleted +
                ", Id=" + Id +
                ", Corporation=" + Corporation +
                ", CreateTime=" + CreateTime +
                ", UpdateTime=" + UpdateTime +
                ", DeleteTime=" + DeleteTime +
                ", IfDeleted=" + IfDeleted +
                '}';
    }
}

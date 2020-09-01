<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcAuthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'authEndTime' => 'auth_end_time',
        'authStartTime' => 'auth_start_time',
        'dataType' => 'data_type',
        'targetIdList' => 'target_id_list',
        'targetType' => 'target_type',
        'tenantName' => 'tenant_name',
    ];
    public function validate() {
        Model::validatePattern('authEndTime', $this->authEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('authStartTime', $this->authStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaxLength('tenantName', $this->tenantName, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->targetIdList) {
            $res['target_id_list'] = $this->targetIdList;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasEbcAuthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['auth_end_time'])){
            $model->authEndTime = $map['auth_end_time'];
        }
        if(isset($map['auth_start_time'])){
            $model->authStartTime = $map['auth_start_time'];
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        if(isset($map['target_id_list'])){
            if(!empty($map['target_id_list'])){
                $model->targetIdList = $map['target_id_list'];
            }
        }
        if(isset($map['target_type'])){
            $model->targetType = $map['target_type'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 授权关系结束时间
    /**
     * @var string
     */
    public $authEndTime;

    // 授权关系开始时间
    /**
     * @var string
     */
    public $authStartTime;

    // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
    /**
     * @var int
     */
    public $dataType;

    // 授权目标数据id列表，最多20个
    /**
     * @var string[]
     */
    public $targetIdList;

    // 1.数据,2.机构,3.认证方,4.ALL
    /**
     * @var int
     */
    public $targetType;

    // 消费方租户id
    /**
     * @var string
     */
    public $tenantName;

}

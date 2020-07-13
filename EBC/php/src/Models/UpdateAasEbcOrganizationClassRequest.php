<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\AttributeDesc;

class UpdateAasEbcOrganizationClassRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'attributeDescList' => 'attribute_desc_list',
        'capacity' => 'capacity',
        'classEndTime' => 'class_end_time',
        'classId' => 'class_id',
        'className' => 'class_name',
        'classStartTime' => 'class_start_time',
        'classStatus' => 'class_status',
        'orgDid' => 'org_did',
    ];
    public function validate() {
        Model::validatePattern('classEndTime', $this->classEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('classStartTime', $this->classStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaxLength('classId', $this->classId, 128);
        Model::validateMaxLength('className', $this->className, 64);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
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
        if (null !== $this->attributeDescList) {
            $res['attribute_desc_list'] = [];
            if(null !== $this->attributeDescList && is_array($this->attributeDescList)){
                $n = 0;
                foreach($this->attributeDescList as $item){
                    $res['attribute_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->classEndTime) {
            $res['class_end_time'] = $this->classEndTime;
        }
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->classStartTime) {
            $res['class_start_time'] = $this->classStartTime;
        }
        if (null !== $this->classStatus) {
            $res['class_status'] = $this->classStatus;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAasEbcOrganizationClassRequest
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
        if(isset($map['attribute_desc_list'])){
            if(!empty($map['attribute_desc_list'])){
                $model->attributeDescList = [];
                $n = 0;
                foreach($map['attribute_desc_list'] as $item) {
                    $model->attributeDescList[$n++] = null !== $item ? AttributeDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['capacity'])){
            $model->capacity = $map['capacity'];
        }
        if(isset($map['class_end_time'])){
            $model->classEndTime = $map['class_end_time'];
        }
        if(isset($map['class_id'])){
            $model->classId = $map['class_id'];
        }
        if(isset($map['class_name'])){
            $model->className = $map['class_name'];
        }
        if(isset($map['class_start_time'])){
            $model->classStartTime = $map['class_start_time'];
        }
        if(isset($map['class_status'])){
            $model->classStatus = $map['class_status'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
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

    // 加密属性描述列表
    // 
    /**
     * @var array
     */
    public $attributeDescList;

    // 容量
    /**
     * @var integer
     */
    public $capacity;

    // 结束时间
    /**
     * @var string
     */
    public $classEndTime;

    // 班级id
    /**
     * @var string
     */
    public $classId;

    // 班级名称
    /**
     * @var string
     */
    public $className;

    // 开始时间
    /**
     * @var string
     */
    public $classStartTime;

    // 1:有效、2:暂停、3:失效
    /**
     * @var integer
     */
    public $classStatus;

    // 企业did
    /**
     * @var string
     */
    public $orgDid;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\PrivacyDesc;
use AntChain\EBC\Models\ProxyDesc;
use AntChain\EBC\Models\PublicDesc;

class CreateBaasEbcOrganizationClassRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'capacity' => 'capacity',
        'classEndTime' => 'class_end_time',
        'className' => 'class_name',
        'classStartTime' => 'class_start_time',
        'classStatus' => 'class_status',
        'orgDid' => 'org_did',
        'privacyDescList' => 'privacy_desc_list',
        'proxyDescList' => 'proxy_desc_list',
        'publicDescList' => 'public_desc_list',
        'secretKey' => 'secret_key',
        'type' => 'type',
    ];
    public function validate() {
        Model::validatePattern('classEndTime', $this->classEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('classStartTime', $this->classStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaxLength('className', $this->className, 64);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('secretKey', $this->secretKey, 512);
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
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->classEndTime) {
            $res['class_end_time'] = $this->classEndTime;
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
        if (null !== $this->privacyDescList) {
            $res['privacy_desc_list'] = [];
            if(null !== $this->privacyDescList && is_array($this->privacyDescList)){
                $n = 0;
                foreach($this->privacyDescList as $item){
                    $res['privacy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->proxyDescList) {
            $res['proxy_desc_list'] = [];
            if(null !== $this->proxyDescList && is_array($this->proxyDescList)){
                $n = 0;
                foreach($this->proxyDescList as $item){
                    $res['proxy_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publicDescList) {
            $res['public_desc_list'] = [];
            if(null !== $this->publicDescList && is_array($this->publicDescList)){
                $n = 0;
                foreach($this->publicDescList as $item){
                    $res['public_desc_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasEbcOrganizationClassRequest
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
        if(isset($map['capacity'])){
            $model->capacity = $map['capacity'];
        }
        if(isset($map['class_end_time'])){
            $model->classEndTime = $map['class_end_time'];
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
        if(isset($map['privacy_desc_list'])){
            if(!empty($map['privacy_desc_list'])){
                $model->privacyDescList = [];
                $n = 0;
                foreach($map['privacy_desc_list'] as $item) {
                    $model->privacyDescList[$n++] = null !== $item ? PrivacyDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['proxy_desc_list'])){
            if(!empty($map['proxy_desc_list'])){
                $model->proxyDescList = [];
                $n = 0;
                foreach($map['proxy_desc_list'] as $item) {
                    $model->proxyDescList[$n++] = null !== $item ? ProxyDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['public_desc_list'])){
            if(!empty($map['public_desc_list'])){
                $model->publicDescList = [];
                $n = 0;
                foreach($map['public_desc_list'] as $item) {
                    $model->publicDescList[$n++] = null !== $item ? PublicDesc::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['secret_key'])){
            $model->secretKey = $map['secret_key'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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

    // 班级容量
    /**
     * @var int
     */
    public $capacity;

    // 结束时间
    /**
     * @var string
     */
    public $classEndTime;

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
     * @var int
     */
    public $classStatus;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 隐私属性描述列表
    // 
    /**
     * @var PrivacyDesc[]
     */
    public $privacyDescList;

    // 托管属性描述列表
    // 
    /**
     * @var ProxyDesc[]
     */
    public $proxyDescList;

    // 公开属性描述列表
    // 
    /**
     * @var PublicDesc[]
     */
    public $publicDescList;

    // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
    /**
     * @var string
     */
    public $secretKey;

    // 1线上、2线下、3混合
    /**
     * @var int
     */
    public $type;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticCaptainDisRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'certNo' => 'cert_no',
        'extensionInfo' => 'extension_info',
        'mobile' => 'mobile',
        'name' => 'name',
        'platformDid' => 'platform_did',
    ];
    public function validate() {}
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticCaptainDisRequest
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
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['extension_info'])){
            $model->extensionInfo = $map['extension_info'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
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

    // 身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 手机号码
    /**
     * @var string
     */
    public $mobile;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 所属平台did
    /**
     * @var string
     */
    public $platformDid;

}

<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASPLUS\Models\BizInfo;

class QueryBaasPlusIndividualidInternalmaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'bizInfo' => 'biz_info',
        'certNo' => 'cert_no',
        'mobile' => 'mobile',
        'name' => 'name',
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
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusIndividualidInternalmaskRequest
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
        if(isset($map['biz_info'])){
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
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

    // 用于内部统计的参数，外部用户请忽略
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 被核验人身份证号码后四位
    /**
     * @var string
     */
    public $certNo;

    // 被核验人手机号码
    /**
     * @var string
     */
    public $mobile;

    // 被核验人姓名的一部分
    /**
     * @var string
     */
    public $name;

}

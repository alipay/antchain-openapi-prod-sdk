<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\AttributeDesc;

class UpdateAasEbcUserCertRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'attributeDescList' => 'attribute_desc_list',
        'certId' => 'cert_id',
        'certPublishTime' => 'cert_publish_time',
        'certStatus' => 'cert_status',
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
    ];
    public function validate() {
        Model::validateMaxLength('certId', $this->certId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validatePattern('certPublishTime', $this->certPublishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
        }
        if (null !== $this->certPublishTime) {
            $res['cert_publish_time'] = $this->certPublishTime;
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateAasEbcUserCertRequest
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
        if(isset($map['cert_id'])){
            $model->certId = $map['cert_id'];
        }
        if(isset($map['cert_publish_time'])){
            $model->certPublishTime = $map['cert_publish_time'];
        }
        if(isset($map['cert_status'])){
            $model->certStatus = $map['cert_status'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
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

    // 证书id
    /**
     * @var string
     */
    public $certId;

    // 首次发布时间
    /**
     * @var string
     */
    public $certPublishTime;

    // 1-有效 2-冻结 3-失效 4-作废 5-其他
    /**
     * @var integer
     */
    public $certStatus;

    // 企业did
    /**
     * @var string
     */
    public $orgDid;

    // 企业用户id
    /**
     * @var string
     */
    public $orgUserId;

}

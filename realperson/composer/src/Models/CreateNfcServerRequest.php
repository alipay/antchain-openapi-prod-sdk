<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CreateNfcServerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 证件类型，ID_CARD，PASSPORT
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 证件姓名
    /**
     * @var string
     */
    public $certName;

    // 出生日期
    /**
     * @var string
     */
    public $birthday;

    // 证件有效期
    /**
     * @var string
     */
    public $validateDate;

    // 护照要素录入模式 NONE MANUAL TRANS
    /**
     * @var string
     */
    public $mode;

    // 扩展参数
    // {"syntheticEdoc":"Y"     是否合成证件图"}
    // {"obtainDocPhoto":"Y"    是否获取高清人像"}
    /**
     * @var string
     */
    public $externParam;

    // metainfo 环境参数，需要通过客户端 SDK 获取
    /**
     * @var string
     */
    public $metaInfo;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面...
    /**
     * @var string
     */
    public $outerOrderNo;

    // 场景ID
    /**
     * @var string
     */
    public $sceneId;

    // 商户自定义的用户ID
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certType'          => 'cert_type',
        'certNo'            => 'cert_no',
        'certName'          => 'cert_name',
        'birthday'          => 'birthday',
        'validateDate'      => 'validate_date',
        'mode'              => 'mode',
        'externParam'       => 'extern_param',
        'metaInfo'          => 'meta_info',
        'outerOrderNo'      => 'outer_order_no',
        'sceneId'           => 'scene_id',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('metaInfo', $this->metaInfo, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->birthday) {
            $res['birthday'] = $this->birthday;
        }
        if (null !== $this->validateDate) {
            $res['validate_date'] = $this->validateDate;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->metaInfo) {
            $res['meta_info'] = $this->metaInfo;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateNfcServerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['birthday'])) {
            $model->birthday = $map['birthday'];
        }
        if (isset($map['validate_date'])) {
            $model->validateDate = $map['validate_date'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['meta_info'])) {
            $model->metaInfo = $map['meta_info'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}

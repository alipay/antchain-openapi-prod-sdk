<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryFilterandreadRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 请求读取数据的did。
    /**
     * @var string
     */
    public $did;

    // 配合owner_did字段一起使用，指定查询目标VC时的过滤字段（可是标准VC内容的字段），指定此字段后，配合需指定filter_value字段。
    /**
     * @var string
     */
    public $filterField;

    // ["VerifiableCredential","DelegateVCRepository","LocationInfo"]
    /**
     * @var string
     */
    public $filterValue;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    /**
     * @var string
     */
    public $signature;

    // 目标VC的subject字段，参与过滤条件。
    /**
     * @var string
     */
    public $subjectDid;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'filterField'       => 'filter_field',
        'filterValue'       => 'filter_value',
        'signature'         => 'signature',
        'subjectDid'        => 'subject_did',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('filterField', $this->filterField, true);
        Model::validateRequired('filterValue', $this->filterValue, true);
        Model::validateRequired('subjectDid', $this->subjectDid, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->filterField) {
            $res['filter_field'] = $this->filterField;
        }
        if (null !== $this->filterValue) {
            $res['filter_value'] = $this->filterValue;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryFilterandreadRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['filter_field'])) {
            $model->filterField = $map['filter_field'];
        }
        if (isset($map['filter_value'])) {
            $model->filterValue = $map['filter_value'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}

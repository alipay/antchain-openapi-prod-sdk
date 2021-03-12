<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryReadRequest extends Model
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

    // 配合filter_field字段，设定具体过滤VC的使用的值，示例说明是在使用`type`字段过滤VC时候的样例。
    /**
     * @var string
     */
    public $filterValue;

    // 如果没有配置参数verifiable_claim_id，则只能通过制定subject_did、issuer_did和filter参数来查找目标VC内容。 因此只有在调用方未知verifiable_claim_id的情况下，才需要配置此参数。
    /**
     * @var string
     */
    public $issuerDid;

    // 保留字段，请求读的did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    /**
     * @var string
     */
    public $signature;

    // 如果没有配置参数verifiable_claim_id，则只能通过制定subject_did、issuer_did和filter参数来查找目标VC内容。
    // 因此只有在调用方未知verifiable_claim_id的情况下，才需要配置此参数。
    /**
     * @var string
     */
    public $subjectDid;

    // 调用方如果已知目标VC的verifiable_claim_id，建议通过配置此参数来读取目标VC内容，并且不需要配置subject_did、issuer_did和 filter相关参数。
    // 注意如果不配置此字段，则必须配置subject_did, issuer_did, filter_field, filter_value 字段。
    // 注意：如果此字段不是"vc:mychain:"前缀开头，则会使用如下规则生成：
    // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    /**
     * @var string
     */
    public $verifiableClaimId;

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
        'issuerDid'         => 'issuer_did',
        'signature'         => 'signature',
        'subjectDid'        => 'subject_did',
        'verifiableClaimId' => 'verifiable_claim_id',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }
        if (null !== $this->verifiableClaimId) {
            $res['verifiable_claim_id'] = $this->verifiableClaimId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryReadRequest
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
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }
        if (isset($map['verifiable_claim_id'])) {
            $model->verifiableClaimId = $map['verifiable_claim_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}

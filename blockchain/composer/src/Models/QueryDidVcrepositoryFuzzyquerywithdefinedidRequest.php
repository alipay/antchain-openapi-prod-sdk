<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidVcrepositoryFuzzyquerywithdefinedidRequest extends Model
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

    // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。查询时使用verifiable_claim_id*
    /**
     * @var string
     */
    public $defineId;

    // 请求读取数据的did
    /**
     * @var string
     */
    public $did;

    // 目标证书VC的颁发者did。
    /**
     * @var string
     */
    public $issuerDid;

    // 目标证书VC的颁发目标did。
    //
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
        'defineId'          => 'define_id',
        'did'               => 'did',
        'issuerDid'         => 'issuer_did',
        'subjectDid'        => 'subject_did',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('defineId', $this->defineId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('issuerDid', $this->issuerDid, true);
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
        if (null !== $this->defineId) {
            $res['define_id'] = $this->defineId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->issuerDid) {
            $res['issuer_did'] = $this->issuerDid;
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
     * @return QueryDidVcrepositoryFuzzyquerywithdefinedidRequest
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
        if (isset($map['define_id'])) {
            $model->defineId = $map['define_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['issuer_did'])) {
            $model->issuerDid = $map['issuer_did'];
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

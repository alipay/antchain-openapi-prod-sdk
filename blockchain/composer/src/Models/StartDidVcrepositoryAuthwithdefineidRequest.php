<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryAuthwithdefineidRequest extends Model
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

    // 配置此did列表，为这些did分配读取目标VC的权限，如果目标VC存储时是明文存储，则操作失败（无需做此权限管控）。
    /**
     * @var string
     */
    public $authDidList;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。
    /**
     * @var string
     */
    public $defineId;

    // 请求操作的did，也是目标VC的owner，也就是VC内容中的subject did身份。
    /**
     * @var string
     */
    public $did;

    // 目标证书的颁发者did。
    /**
     * @var string
     */
    public $issuerDid;

    // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    /**
     * @var string
     */
    public $signature;

    // 目标证书VC的颁发目标did。
    /**
     * @var string
     */
    public $subjectDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authDidList'       => 'auth_did_list',
        'bizCode'           => 'biz_code',
        'defineId'          => 'define_id',
        'did'               => 'did',
        'issuerDid'         => 'issuer_did',
        'signature'         => 'signature',
        'subjectDid'        => 'subject_did',
    ];

    public function validate()
    {
        Model::validateRequired('authDidList', $this->authDidList, true);
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
        if (null !== $this->authDidList) {
            $res['auth_did_list'] = $this->authDidList;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
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
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->subjectDid) {
            $res['subject_did'] = $this->subjectDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryAuthwithdefineidRequest
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
        if (isset($map['auth_did_list'])) {
            $model->authDidList = $map['auth_did_list'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
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
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['subject_did'])) {
            $model->subjectDid = $map['subject_did'];
        }

        return $model;
    }
}

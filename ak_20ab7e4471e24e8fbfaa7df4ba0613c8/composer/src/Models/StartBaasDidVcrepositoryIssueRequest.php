<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_20ab7e4471e24e8fbfaa7df4ba0613c8\Models;

use AlibabaCloud\Tea\Model;

class StartBaasDidVcrepositoryIssueRequest extends Model
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

    // 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
    // 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
    //
    /**
     * @var string[]
     */
    public $authDidList;

    // 颁发证书声明的原始声明内容，其中claim字段为json格式
    /**
     * @var BareClaim
     */
    public $bareClaim;

    // 过期时间，如果用不过期可以设置为：-1。
    // 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
    /**
     * @var int
     */
    public $expire;

    // 颁发证书方，该did必须为调用者自己或者自己代理的did。
    //
    /**
     * @var string
     */
    public $issuer;

    // 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    /**
     * @var int
     */
    public $specifiedClaimIdType;

    // 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
    /**
     * @var string
     */
    public $subject;

    // 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
    // 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
    /**
     * @var string[]
     */
    public $type;

    // 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
    // 如果不指定，则会随机生成一个规范的verifiable_claim_id。
    // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
    /**
     * @var string
     */
    public $verifiableClaimId;

    // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
    /**
     * @var string
     */
    public $verifyStatusType;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    /**
     * @var string
     */
    public $verifiableClaimContent;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'authDidList'            => 'auth_did_list',
        'bareClaim'              => 'bare_claim',
        'expire'                 => 'expire',
        'issuer'                 => 'issuer',
        'specifiedClaimIdType'   => 'specified_claim_id_type',
        'subject'                => 'subject',
        'type'                   => 'type',
        'verifiableClaimId'      => 'verifiable_claim_id',
        'verifyStatusType'       => 'verify_status_type',
        'bizCode'                => 'biz_code',
        'verifiableClaimContent' => 'verifiable_claim_content',
    ];

    public function validate()
    {
        Model::validateRequired('bareClaim', $this->bareClaim, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('issuer', $this->issuer, true);
        Model::validateRequired('subject', $this->subject, true);
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
        if (null !== $this->bareClaim) {
            $res['bare_claim'] = null !== $this->bareClaim ? $this->bareClaim->toMap() : null;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->issuer) {
            $res['issuer'] = $this->issuer;
        }
        if (null !== $this->specifiedClaimIdType) {
            $res['specified_claim_id_type'] = $this->specifiedClaimIdType;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->verifiableClaimId) {
            $res['verifiable_claim_id'] = $this->verifiableClaimId;
        }
        if (null !== $this->verifyStatusType) {
            $res['verify_status_type'] = $this->verifyStatusType;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->verifiableClaimContent) {
            $res['verifiable_claim_content'] = $this->verifiableClaimContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartBaasDidVcrepositoryIssueRequest
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
            if (!empty($map['auth_did_list'])) {
                $model->authDidList = $map['auth_did_list'];
            }
        }
        if (isset($map['bare_claim'])) {
            $model->bareClaim = BareClaim::fromMap($map['bare_claim']);
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['issuer'])) {
            $model->issuer = $map['issuer'];
        }
        if (isset($map['specified_claim_id_type'])) {
            $model->specifiedClaimIdType = $map['specified_claim_id_type'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['type'])) {
            if (!empty($map['type'])) {
                $model->type = $map['type'];
            }
        }
        if (isset($map['verifiable_claim_id'])) {
            $model->verifiableClaimId = $map['verifiable_claim_id'];
        }
        if (isset($map['verify_status_type'])) {
            $model->verifyStatusType = $map['verify_status_type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['verifiable_claim_content'])) {
            $model->verifiableClaimContent = $map['verifiable_claim_content'];
        }

        return $model;
    }
}

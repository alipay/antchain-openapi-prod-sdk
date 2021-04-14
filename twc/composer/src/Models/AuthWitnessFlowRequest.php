<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AuthWitnessFlowRequest extends Model
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

    // 发起请求的实例应用ID
    /**
     * @var string
     */
    public $appId;

    // 证书id
    /**
     * @var string
     */
    public $certId;

    // 签署页码，单个签时必传
    /**
     * @var string
     */
    public $page;

    // 签署x坐标，单个签时必传
    /**
     * @var string
     */
    public $posX;

    // 签署y坐标，单个签时必传
    /**
     * @var string
     */
    public $posY;

    // 印章图片key
    /**
     * @var string
     */
    public $sealFileKey;

    // 印章id
    /**
     * @var string
     */
    public $sealId;

    // 印章类型，1-模板，2-手绘
    /**
     * @var int
     */
    public $sealType;

    // 签署类型，单个签时必传
    /**
     * @var string
     */
    public $signatureType;

    // 批量签署信息，批量签时必传
    /**
     * @var string
     */
    public $signDatas;

    // 待签署文档摘要值，单个签时必传
    /**
     * @var string
     */
    public $signHash;

    // 签署票证
    /**
     * @var string
     */
    public $signTicket;

    // 签署主体账号id
    /**
     * @var string
     */
    public $subjectAccountId;

    // 第三方文档id，单个签时必传
    /**
     * @var string
     */
    public $thirdDocId;

    // 发起请求的鉴权token
    /**
     * @var string
     */
    public $token;

    // 见证流程id
    /**
     * @var string
     */
    public $witnessFlowId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'certId'            => 'cert_id',
        'page'              => 'page',
        'posX'              => 'pos_x',
        'posY'              => 'pos_y',
        'sealFileKey'       => 'seal_file_key',
        'sealId'            => 'seal_id',
        'sealType'          => 'seal_type',
        'signatureType'     => 'signature_type',
        'signDatas'         => 'sign_datas',
        'signHash'          => 'sign_hash',
        'signTicket'        => 'sign_ticket',
        'subjectAccountId'  => 'subject_account_id',
        'thirdDocId'        => 'third_doc_id',
        'token'             => 'token',
        'witnessFlowId'     => 'witness_flow_id',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('sealType', $this->sealType, true);
        Model::validateRequired('signTicket', $this->signTicket, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('witnessFlowId', $this->witnessFlowId, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        if (null !== $this->sealFileKey) {
            $res['seal_file_key'] = $this->sealFileKey;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->sealType) {
            $res['seal_type'] = $this->sealType;
        }
        if (null !== $this->signatureType) {
            $res['signature_type'] = $this->signatureType;
        }
        if (null !== $this->signDatas) {
            $res['sign_datas'] = $this->signDatas;
        }
        if (null !== $this->signHash) {
            $res['sign_hash'] = $this->signHash;
        }
        if (null !== $this->signTicket) {
            $res['sign_ticket'] = $this->signTicket;
        }
        if (null !== $this->subjectAccountId) {
            $res['subject_account_id'] = $this->subjectAccountId;
        }
        if (null !== $this->thirdDocId) {
            $res['third_doc_id'] = $this->thirdDocId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->witnessFlowId) {
            $res['witness_flow_id'] = $this->witnessFlowId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthWitnessFlowRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['cert_id'])) {
            $model->certId = $map['cert_id'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }
        if (isset($map['seal_file_key'])) {
            $model->sealFileKey = $map['seal_file_key'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['seal_type'])) {
            $model->sealType = $map['seal_type'];
        }
        if (isset($map['signature_type'])) {
            $model->signatureType = $map['signature_type'];
        }
        if (isset($map['sign_datas'])) {
            $model->signDatas = $map['sign_datas'];
        }
        if (isset($map['sign_hash'])) {
            $model->signHash = $map['sign_hash'];
        }
        if (isset($map['sign_ticket'])) {
            $model->signTicket = $map['sign_ticket'];
        }
        if (isset($map['subject_account_id'])) {
            $model->subjectAccountId = $map['subject_account_id'];
        }
        if (isset($map['third_doc_id'])) {
            $model->thirdDocId = $map['third_doc_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['witness_flow_id'])) {
            $model->witnessFlowId = $map['witness_flow_id'];
        }

        return $model;
    }
}

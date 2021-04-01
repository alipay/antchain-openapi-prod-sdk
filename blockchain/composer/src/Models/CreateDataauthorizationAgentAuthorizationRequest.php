<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationAgentAuthorizationRequest extends Model
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

    // 业务UUID
    /**
     * @var string
     */
    public $bizUid;

    // 授权原因
    /**
     * @var string
     */
    public $comment;

    // 数据资产ID
    /**
     * @var string
     */
    public $dataId;

    // 过期时间
    /**
     * @var int
     */
    public $expire;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;

    // 授权规则
    /**
     * @var AuthorizationRule
     */
    public $rule;

    // 被授权人ID
    /**
     * @var string
     */
    public $subjectId;

    // 申请代理授权的参与方DID
    /**
     * @var string
     */
    public $applicantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUid'            => 'biz_uid',
        'comment'           => 'comment',
        'dataId'            => 'data_id',
        'expire'            => 'expire',
        'extensionInfo'     => 'extension_info',
        'rule'              => 'rule',
        'subjectId'         => 'subject_id',
        'applicantId'       => 'applicant_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('subjectId', $this->subjectId, true);
        Model::validateRequired('applicantId', $this->applicantId, true);
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
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->rule) {
            $res['rule'] = null !== $this->rule ? $this->rule->toMap() : null;
        }
        if (null !== $this->subjectId) {
            $res['subject_id'] = $this->subjectId;
        }
        if (null !== $this->applicantId) {
            $res['applicant_id'] = $this->applicantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationAgentAuthorizationRequest
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
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['rule'])) {
            $model->rule = AuthorizationRule::fromMap($map['rule']);
        }
        if (isset($map['subject_id'])) {
            $model->subjectId = $map['subject_id'];
        }
        if (isset($map['applicant_id'])) {
            $model->applicantId = $map['applicant_id'];
        }

        return $model;
    }
}

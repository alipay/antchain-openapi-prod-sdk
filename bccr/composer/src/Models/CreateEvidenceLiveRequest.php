<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceLiveRequest extends Model
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

    // 取证用户id
    /**
     * @var string
     */
    public $evidenceUserId;

    // 取证公证处
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证类型（通用直播取证：DEFAULT）
    /**
     * @var string
     */
    public $type;

    // 取证网址信息
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrl;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 主播 ID
    /**
     * @var string
     */
    public $profileId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'evidenceUserId'    => 'evidence_user_id',
        'notaryOffice'      => 'notary_office',
        'type'              => 'type',
        'webUrl'            => 'web_url',
        'clientToken'       => 'client_token',
        'profileId'         => 'profile_id',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('webUrl', $this->webUrl, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->webUrl) {
            $res['web_url'] = null !== $this->webUrl ? $this->webUrl->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->profileId) {
            $res['profile_id'] = $this->profileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceLiveRequest
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
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['web_url'])) {
            $model->webUrl = EvidenceWebUrlInfo::fromMap($map['web_url']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['profile_id'])) {
            $model->profileId = $map['profile_id'];
        }

        return $model;
    }
}

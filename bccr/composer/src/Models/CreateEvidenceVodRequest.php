<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceVodRequest extends Model
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

    // 公证处code
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
    /**
     * @var string
     */
    public $type;

    // 待取证点播网站网址
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrl;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 取证平台
    /**
     * @var int
     */
    public $obtainPlatform;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'evidenceUserId'    => 'evidence_user_id',
        'notaryOffice'      => 'notary_office',
        'type'              => 'type',
        'webUrl'            => 'web_url',
        'clientToken'       => 'client_token',
        'obtainPlatform'    => 'obtain_platform',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('webUrl', $this->webUrl, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('obtainPlatform', $this->obtainPlatform, true);
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
        if (null !== $this->obtainPlatform) {
            $res['obtain_platform'] = $this->obtainPlatform;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceVodRequest
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
        if (isset($map['obtain_platform'])) {
            $model->obtainPlatform = $map['obtain_platform'];
        }

        return $model;
    }
}

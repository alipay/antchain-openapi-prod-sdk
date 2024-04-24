<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceRecordscreenRequest extends Model
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

    // 取证名称
    /**
     * @var string
     */
    public $name;

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

    // 取证网址信息
    /**
     * @var EvidenceWebUrlInfo[]
     */
    public $webUrls;

    // 取证三方账号信息
    /**
     * @var EvidenceThirdPartyInfo
     */
    public $thirdPartyInfo;

    // 取证服务器地域
    /**
     * @var string
     */
    public $area;

    // 最大录屏时间（单位：分钟）
    /**
     * @var int
     */
    public $maxTimeInMin;

    // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
    /**
     * @var int
     */
    public $waitInMin;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'evidenceUserId'    => 'evidence_user_id',
        'notaryOffice'      => 'notary_office',
        'webUrls'           => 'web_urls',
        'thirdPartyInfo'    => 'third_party_info',
        'area'              => 'area',
        'maxTimeInMin'      => 'max_time_in_min',
        'waitInMin'         => 'wait_in_min',
        'callbackUrl'       => 'callback_url',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('thirdPartyInfo', $this->thirdPartyInfo, true);
        Model::validateRequired('area', $this->area, true);
        Model::validateRequired('maxTimeInMin', $this->maxTimeInMin, true);
        Model::validateRequired('waitInMin', $this->waitInMin, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->webUrls) {
            $res['web_urls'] = [];
            if (null !== $this->webUrls && \is_array($this->webUrls)) {
                $n = 0;
                foreach ($this->webUrls as $item) {
                    $res['web_urls'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->thirdPartyInfo) {
            $res['third_party_info'] = null !== $this->thirdPartyInfo ? $this->thirdPartyInfo->toMap() : null;
        }
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->maxTimeInMin) {
            $res['max_time_in_min'] = $this->maxTimeInMin;
        }
        if (null !== $this->waitInMin) {
            $res['wait_in_min'] = $this->waitInMin;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceRecordscreenRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['web_urls'])) {
            if (!empty($map['web_urls'])) {
                $model->webUrls = [];
                $n              = 0;
                foreach ($map['web_urls'] as $item) {
                    $model->webUrls[$n++] = null !== $item ? EvidenceWebUrlInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['third_party_info'])) {
            $model->thirdPartyInfo = EvidenceThirdPartyInfo::fromMap($map['third_party_info']);
        }
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['max_time_in_min'])) {
            $model->maxTimeInMin = $map['max_time_in_min'];
        }
        if (isset($map['wait_in_min'])) {
            $model->waitInMin = $map['wait_in_min'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}

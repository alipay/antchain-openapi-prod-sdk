<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CancelClaimRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报案单编号（蚂蚁内部）
    /**
     * @var string
     */
    public $claimNotificationFormNoInner;

    // 报案撤销附加内容
    /**
     * @var string
     */
    public $bizInfo;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'claimNotificationFormNoInner' => 'claim_notification_form_no_inner',
        'bizInfo'                      => 'biz_info',
    ];

    public function validate()
    {
        Model::validateRequired('claimNotificationFormNoInner', $this->claimNotificationFormNoInner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->claimNotificationFormNoInner) {
            $res['claim_notification_form_no_inner'] = $this->claimNotificationFormNoInner;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = $this->bizInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelClaimRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['claim_notification_form_no_inner'])) {
            $model->claimNotificationFormNoInner = $map['claim_notification_form_no_inner'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = $map['biz_info'];
        }

        return $model;
    }
}

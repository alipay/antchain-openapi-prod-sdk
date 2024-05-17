<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class IdentityInfo extends Model
{
    // 需要打标的税号
    /**
     * @example 税号
     *
     * @var string
     */
    public $identityId;

    // 授权编号
    /**
     * @example 授权编号
     *
     * @var string
     */
    public $authCode;

    // 授权开始时间
    /**
     * @example YYYY-MM-DD HH:MM:SS
     *
     * @var string
     */
    public $authStartTime;

    // 授权截止时间
    /**
     * @example YYYY-MM-DD HH:MM:SS
     *
     * @var string
     */
    public $authEndTime;

    // 授权书url
    /**
     * @example https://mass.alipay.com/credit_zmepconnector/afts/file/A*mNBcT6AvV5YAAAAAAAAAAAAADTp5AA?t=xIcb2AUdCcOajPNowepVTTooDnSqmrPtbbAnl4fgurADAAAAZAAAeTplRGus
     *
     * @var string
     */
    public $authUrl;
    protected $_name = [
        'identityId'    => 'identity_id',
        'authCode'      => 'auth_code',
        'authStartTime' => 'auth_start_time',
        'authEndTime'   => 'auth_end_time',
        'authUrl'       => 'auth_url',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('authCode', $this->authCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }

        return $model;
    }
}

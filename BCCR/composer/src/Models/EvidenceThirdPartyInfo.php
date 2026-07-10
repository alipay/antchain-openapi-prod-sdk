<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidenceThirdPartyInfo extends Model
{
    // 三方系统用户提交网址时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $submitTime;

    // 三方系统地址
    /**
     * @example 三方系统地址
     *
     * @var string
     */
    public $systemUrl;

    // 三方系统账号
    /**
     * @example 三方系统账号
     *
     * @var string
     */
    public $account;

    // 三方系统名称
    /**
     * @example 三方系统名称
     *
     * @var string
     */
    public $systemName;

    // 用户取证时登录的时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $loginTime;

    // 用户取证时登录的IP
    /**
     * @example 用户取证时登录的IP
     *
     * @var string
     */
    public $loginIp;
    protected $_name = [
        'submitTime' => 'submit_time',
        'systemUrl'  => 'system_url',
        'account'    => 'account',
        'systemName' => 'system_name',
        'loginTime'  => 'login_time',
        'loginIp'    => 'login_ip',
    ];

    public function validate()
    {
        Model::validateRequired('submitTime', $this->submitTime, true);
        Model::validateRequired('systemUrl', $this->systemUrl, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('systemName', $this->systemName, true);
        Model::validateRequired('loginTime', $this->loginTime, true);
        Model::validateRequired('loginIp', $this->loginIp, true);
        Model::validatePattern('submitTime', $this->submitTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('loginTime', $this->loginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->submitTime) {
            $res['submit_time'] = $this->submitTime;
        }
        if (null !== $this->systemUrl) {
            $res['system_url'] = $this->systemUrl;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->systemName) {
            $res['system_name'] = $this->systemName;
        }
        if (null !== $this->loginTime) {
            $res['login_time'] = $this->loginTime;
        }
        if (null !== $this->loginIp) {
            $res['login_ip'] = $this->loginIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidenceThirdPartyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['submit_time'])) {
            $model->submitTime = $map['submit_time'];
        }
        if (isset($map['system_url'])) {
            $model->systemUrl = $map['system_url'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['system_name'])) {
            $model->systemName = $map['system_name'];
        }
        if (isset($map['login_time'])) {
            $model->loginTime = $map['login_time'];
        }
        if (isset($map['login_ip'])) {
            $model->loginIp = $map['login_ip'];
        }

        return $model;
    }
}

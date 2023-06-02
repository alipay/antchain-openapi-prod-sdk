<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoginconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 密码最小长度
    /**
     * @var int
     */
    public $passwordMinLength;

    // 密码最大长度
    /**
     * @var int
     */
    public $passwordMaxLength;

    // 密码是否必须包含小写字母
    /**
     * @var bool
     */
    public $passwordLowercaseLetter;

    // 密码是否必须包含大写字母
    /**
     * @var bool
     */
    public $passwordUppercaseLetter;

    // 密码是否必须包含字母
    /**
     * @var bool
     */
    public $passwordLetter;

    // 密码是否必须包含数字
    /**
     * @var bool
     */
    public $passwordDigit;

    // 密码是否必须包含特殊字符
    /**
     * @var bool
     */
    public $passwordSpecialChar;

    // 是否检查密码有效
    /**
     * @var bool
     */
    public $passwordValidCheck;

    // 密码有效期
    /**
     * @var int
     */
    public $passwordValidPeriod;

    // 密码过期后是否允许登录
    /**
     * @var bool
     */
    public $passwordExpiredLogin;

    // 是否检查密码历史
    /**
     * @var bool
     */
    public $passwordHistoryCheck;

    // 密码历史个数
    /**
     * @var int
     */
    public $passwordHistoryNum;

    // 重试校验是否触发锁定
    /**
     * @var bool
     */
    public $verifyAttemptsCheck;

    // 重试校验窗口
    /**
     * @var int
     */
    public $verifyAttemptsWindow;

    // 重试校验触发锁定阈值
    /**
     * @var int
     */
    public $verifyAttemptsThreshold;

    // 锁定时间
    /**
     * @var int
     */
    public $lockoutDuration;

    // 是否检查账户活跃
    /**
     * @var bool
     */
    public $activeCheck;

    // 活跃周期，非活跃时锁定登录
    /**
     * @var int
     */
    public $activePeriod;

    // 是否允许自主管理密码
    /**
     * @var bool
     */
    public $passwordSelfManage;

    // 是否允许自主管理MFA
    /**
     * @var bool
     */
    public $mfaSelfManage;

    // 并发登录的ip数量，小于1表示不限制
    /**
     * @var int
     */
    public $concurrentIpCount;
    protected $_name = [
        'authToken'               => 'auth_token',
        'passwordMinLength'       => 'password_min_length',
        'passwordMaxLength'       => 'password_max_length',
        'passwordLowercaseLetter' => 'password_lowercase_letter',
        'passwordUppercaseLetter' => 'password_uppercase_letter',
        'passwordLetter'          => 'password_letter',
        'passwordDigit'           => 'password_digit',
        'passwordSpecialChar'     => 'password_special_char',
        'passwordValidCheck'      => 'password_valid_check',
        'passwordValidPeriod'     => 'password_valid_period',
        'passwordExpiredLogin'    => 'password_expired_login',
        'passwordHistoryCheck'    => 'password_history_check',
        'passwordHistoryNum'      => 'password_history_num',
        'verifyAttemptsCheck'     => 'verify_attempts_check',
        'verifyAttemptsWindow'    => 'verify_attempts_window',
        'verifyAttemptsThreshold' => 'verify_attempts_threshold',
        'lockoutDuration'         => 'lockout_duration',
        'activeCheck'             => 'active_check',
        'activePeriod'            => 'active_period',
        'passwordSelfManage'      => 'password_self_manage',
        'mfaSelfManage'           => 'mfa_self_manage',
        'concurrentIpCount'       => 'concurrent_ip_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->passwordMinLength) {
            $res['password_min_length'] = $this->passwordMinLength;
        }
        if (null !== $this->passwordMaxLength) {
            $res['password_max_length'] = $this->passwordMaxLength;
        }
        if (null !== $this->passwordLowercaseLetter) {
            $res['password_lowercase_letter'] = $this->passwordLowercaseLetter;
        }
        if (null !== $this->passwordUppercaseLetter) {
            $res['password_uppercase_letter'] = $this->passwordUppercaseLetter;
        }
        if (null !== $this->passwordLetter) {
            $res['password_letter'] = $this->passwordLetter;
        }
        if (null !== $this->passwordDigit) {
            $res['password_digit'] = $this->passwordDigit;
        }
        if (null !== $this->passwordSpecialChar) {
            $res['password_special_char'] = $this->passwordSpecialChar;
        }
        if (null !== $this->passwordValidCheck) {
            $res['password_valid_check'] = $this->passwordValidCheck;
        }
        if (null !== $this->passwordValidPeriod) {
            $res['password_valid_period'] = $this->passwordValidPeriod;
        }
        if (null !== $this->passwordExpiredLogin) {
            $res['password_expired_login'] = $this->passwordExpiredLogin;
        }
        if (null !== $this->passwordHistoryCheck) {
            $res['password_history_check'] = $this->passwordHistoryCheck;
        }
        if (null !== $this->passwordHistoryNum) {
            $res['password_history_num'] = $this->passwordHistoryNum;
        }
        if (null !== $this->verifyAttemptsCheck) {
            $res['verify_attempts_check'] = $this->verifyAttemptsCheck;
        }
        if (null !== $this->verifyAttemptsWindow) {
            $res['verify_attempts_window'] = $this->verifyAttemptsWindow;
        }
        if (null !== $this->verifyAttemptsThreshold) {
            $res['verify_attempts_threshold'] = $this->verifyAttemptsThreshold;
        }
        if (null !== $this->lockoutDuration) {
            $res['lockout_duration'] = $this->lockoutDuration;
        }
        if (null !== $this->activeCheck) {
            $res['active_check'] = $this->activeCheck;
        }
        if (null !== $this->activePeriod) {
            $res['active_period'] = $this->activePeriod;
        }
        if (null !== $this->passwordSelfManage) {
            $res['password_self_manage'] = $this->passwordSelfManage;
        }
        if (null !== $this->mfaSelfManage) {
            $res['mfa_self_manage'] = $this->mfaSelfManage;
        }
        if (null !== $this->concurrentIpCount) {
            $res['concurrent_ip_count'] = $this->concurrentIpCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoginconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['password_min_length'])) {
            $model->passwordMinLength = $map['password_min_length'];
        }
        if (isset($map['password_max_length'])) {
            $model->passwordMaxLength = $map['password_max_length'];
        }
        if (isset($map['password_lowercase_letter'])) {
            $model->passwordLowercaseLetter = $map['password_lowercase_letter'];
        }
        if (isset($map['password_uppercase_letter'])) {
            $model->passwordUppercaseLetter = $map['password_uppercase_letter'];
        }
        if (isset($map['password_letter'])) {
            $model->passwordLetter = $map['password_letter'];
        }
        if (isset($map['password_digit'])) {
            $model->passwordDigit = $map['password_digit'];
        }
        if (isset($map['password_special_char'])) {
            $model->passwordSpecialChar = $map['password_special_char'];
        }
        if (isset($map['password_valid_check'])) {
            $model->passwordValidCheck = $map['password_valid_check'];
        }
        if (isset($map['password_valid_period'])) {
            $model->passwordValidPeriod = $map['password_valid_period'];
        }
        if (isset($map['password_expired_login'])) {
            $model->passwordExpiredLogin = $map['password_expired_login'];
        }
        if (isset($map['password_history_check'])) {
            $model->passwordHistoryCheck = $map['password_history_check'];
        }
        if (isset($map['password_history_num'])) {
            $model->passwordHistoryNum = $map['password_history_num'];
        }
        if (isset($map['verify_attempts_check'])) {
            $model->verifyAttemptsCheck = $map['verify_attempts_check'];
        }
        if (isset($map['verify_attempts_window'])) {
            $model->verifyAttemptsWindow = $map['verify_attempts_window'];
        }
        if (isset($map['verify_attempts_threshold'])) {
            $model->verifyAttemptsThreshold = $map['verify_attempts_threshold'];
        }
        if (isset($map['lockout_duration'])) {
            $model->lockoutDuration = $map['lockout_duration'];
        }
        if (isset($map['active_check'])) {
            $model->activeCheck = $map['active_check'];
        }
        if (isset($map['active_period'])) {
            $model->activePeriod = $map['active_period'];
        }
        if (isset($map['password_self_manage'])) {
            $model->passwordSelfManage = $map['password_self_manage'];
        }
        if (isset($map['mfa_self_manage'])) {
            $model->mfaSelfManage = $map['mfa_self_manage'];
        }
        if (isset($map['concurrent_ip_count'])) {
            $model->concurrentIpCount = $map['concurrent_ip_count'];
        }

        return $model;
    }
}

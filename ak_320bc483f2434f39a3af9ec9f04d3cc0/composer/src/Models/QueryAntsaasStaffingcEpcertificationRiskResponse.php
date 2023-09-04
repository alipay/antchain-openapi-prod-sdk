<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsaasStaffingcEpcertificationRiskResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 认证状态，取值如下： SUCCESS，代表成功 INIT，代表初始化 CERTIFYING，代表认证中 FAIL，代表失败
    /**
     * @var string
     */
    public $certifyStatus;

    // 授权状态，从用户授权开始计时，时间窗口3天 取值如下： SUCCESS，代表用户已授权 FAIL，代表用户未授权或授权失效
    /**
     * @var string
     */
    public $authStatus;

    // 企业全称，字段auth_status为SUCCESS时返回
    /**
     * @var string
     */
    public $epName;

    // 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
    /**
     * @var string
     */
    public $epCertNo;

    // 法人认证姓名，字段auth_status为SUCCESS时返回
    /**
     * @var string
     */
    public $userName;

    // 法人认证身份证号
    /**
     * @var string
     */
    public $certifyPersonCardNoPostfix;

    // 认证失败原因列表，当certify_status=FAIL时返回
    /**
     * @var string[]
     */
    public $certifyFailReasons;

    // 认证风险识别结果集合
    // 枚举值
    // 低风险认证: CERTIFICATION_LOW_RISK
    // 中风险认证: CERTIFICATION_MID_RISK2
    // 高风险认证: CERTIFICATION_HIGH_RISK
    // 批量注册: ONE_ADDR_MULTI_COMP
    // 经营异常: OPERATION_ABNORMAL
    // 交叉任职: CROSS_POSITION
    // 涉嫌洗钱: SUSPECTED_MONEY_LAUNDERING
    // 空壳公司: SHELL_COMPANY
    // 失信被执行: BREACH_PROMISE_EXECUTION
    // 严重违法失信: SERIOUS_BREACH_TRUST
    // 行政处罚: ADMINISTRATIVE_SANCTION
    // 司法冻结: JUDICIAL_FREEZE
    // 违规违禁: VIOLATION_BAN
    // 信贷逾期: CREDIT_OVERDUE
    // 多头借贷: LONG_BORROWING
    // 疑似欺诈: SUSPECTED_FRAUD
    // 疑似涉赌博: SUSPECTED_GAMBLING
    // 企业芝麻证: LI_XIN_CERTIFICATE
    /**
     * @var string[]
     */
    public $riskIdentifyResult;

    // 空壳企业等级，描述企业空壳程度。
    // 枚举值
    // 优秀企业，没有空壳企业的常见特征，且有很多正向特征证明其正常经营: A+
    // 较为优秀的企业，没有空壳企业的常见特征，且有较多正向特征证明其正常经营: A
    // 较为优秀的企业，几乎没有空壳企业的常见特征，或者有较多正向特征证明其正常经营: B
    // 普通企业，一般没有空壳企业的常见特征，或者有很少量能反映其正常经营的数据: M+
    // 普通企业或者新注册的企业，一般没有空壳企业的常见特征，但是也没有太多能反映其在正常生产经营的数据: M
    // 普通企业，一般没有明显空壳企业的常见特征，也没有太多能反映其在正常生产经营的数据，可能和空壳企业有少量交集: M-
    // 较差企业，有部分空壳企业特征，可能有较少能反映其在正常生产经营的数据。建议这部分企业酌情考虑风险: C+
    // 差企业，有较多空壳企业特征，几乎没有能反映其在正常生产经营的数据: C
    // 差企业，有很多明显空壳企业特征，几乎没有能反映其在正常生产经营的数据: D
    /**
     * @var string
     */
    public $shellCompanyLevel;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'certifyStatus'              => 'certify_status',
        'authStatus'                 => 'auth_status',
        'epName'                     => 'ep_name',
        'epCertNo'                   => 'ep_cert_no',
        'userName'                   => 'user_name',
        'certifyPersonCardNoPostfix' => 'certify_person_card_no_postfix',
        'certifyFailReasons'         => 'certify_fail_reasons',
        'riskIdentifyResult'         => 'risk_identify_result',
        'shellCompanyLevel'          => 'shell_company_level',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->certifyStatus) {
            $res['certify_status'] = $this->certifyStatus;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->epName) {
            $res['ep_name'] = $this->epName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->certifyPersonCardNoPostfix) {
            $res['certify_person_card_no_postfix'] = $this->certifyPersonCardNoPostfix;
        }
        if (null !== $this->certifyFailReasons) {
            $res['certify_fail_reasons'] = $this->certifyFailReasons;
        }
        if (null !== $this->riskIdentifyResult) {
            $res['risk_identify_result'] = $this->riskIdentifyResult;
        }
        if (null !== $this->shellCompanyLevel) {
            $res['shell_company_level'] = $this->shellCompanyLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntsaasStaffingcEpcertificationRiskResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['certify_status'])) {
            $model->certifyStatus = $map['certify_status'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['ep_name'])) {
            $model->epName = $map['ep_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['certify_person_card_no_postfix'])) {
            $model->certifyPersonCardNoPostfix = $map['certify_person_card_no_postfix'];
        }
        if (isset($map['certify_fail_reasons'])) {
            if (!empty($map['certify_fail_reasons'])) {
                $model->certifyFailReasons = $map['certify_fail_reasons'];
            }
        }
        if (isset($map['risk_identify_result'])) {
            if (!empty($map['risk_identify_result'])) {
                $model->riskIdentifyResult = $map['risk_identify_result'];
            }
        }
        if (isset($map['shell_company_level'])) {
            $model->shellCompanyLevel = $map['shell_company_level'];
        }

        return $model;
    }
}

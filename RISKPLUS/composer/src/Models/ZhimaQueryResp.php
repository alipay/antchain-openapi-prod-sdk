<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ZhimaQueryResp extends Model
{
    // 认证的企业证件号
    /**
     * @example 91330000327827106L
     *
     * @var string
     */
    public $epCertNo;

    // 认证的企业名
    /**
     * @example 芝麻信用管理有限公司
     *
     * @var string
     */
    public $epName;

    // 认证不通过的错误码
    /**
     * @example BIZ_LICENSE_LEGAL_INFO_NO_MATCH
     *
     * @var string
     */
    public $failedCode;

    // 认证是否通过，通过为true，不通过为false
    /**
     * @example “true“,”false”
     *
     * @var string
     */
    public $passed;

    // 10000是成功，其余是失败
    /**
     * @example OK/40002
     *
     * @var string
     */
    public $resultCode;

    /**
     * @example Success/Invalid Arguments
     *
     * @var string
     */
    public $resultMsg;

    /**
     * @example isv.invalid-app-id
     *
     * @var string
     */
    public $subCode;

    /**
     * @example 无效的AppID参数
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'epCertNo'   => 'ep_cert_no',
        'epName'     => 'ep_name',
        'failedCode' => 'failed_code',
        'passed'     => 'passed',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'subCode'    => 'sub_code',
        'subMsg'     => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->epName) {
            $res['ep_name'] = $this->epName;
        }
        if (null !== $this->failedCode) {
            $res['failed_code'] = $this->failedCode;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZhimaQueryResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['ep_name'])) {
            $model->epName = $map['ep_name'];
        }
        if (isset($map['failed_code'])) {
            $model->failedCode = $map['failed_code'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}

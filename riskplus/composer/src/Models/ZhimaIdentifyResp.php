<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ZhimaIdentifyResp extends Model
{
    // 唯一ID，接口正常的话有此字段
    /**
     * @example ZM201505190ad422641448624704506270407
     *
     * @var string
     */
    public $bizNo;

    // 带参数的回调地址，接口正常的话有此字段
    /**
     * @example http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&sign=dsgdsfhgdsfh
     *
     * @var string
     */
    public $certifyUrl;

    // 蚂蚁调用芝麻的错误码
    /**
     * @example OK
     *
     * @var string
     */
    public $resultCode;

    // 蚂蚁调用芝麻的结果描述
    /**
     * @example Success/Invalid Arguments
     *
     * @var string
     */
    public $resultMsg;

    // 蚂蚁调用芝麻的错误码
    /**
     * @example isv.invalid-app-id
     *
     * @var string
     */
    public $subCode;

    // 蚂蚁调用芝麻信息
    /**
     * @example 无效的AppID参数
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'bizNo'      => 'biz_no',
        'certifyUrl' => 'certify_url',
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->certifyUrl) {
            $res['certify_url'] = $this->certifyUrl;
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
     * @return ZhimaIdentifyResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['certify_url'])) {
            $model->certifyUrl = $map['certify_url'];
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

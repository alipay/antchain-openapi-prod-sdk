<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryEnterpriseBusinessinfoResponse extends Model
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

    // 签名之后的结果
    /**
     * @var string
     */
    public $signature;

    // 国民经济行业代码
    /**
     * @var string
     */
    public $industryCode;

    // 国民经济行业名称
    /**
     * @var string
     */
    public $industryName;

    // 行业门类代码
    /**
     * @var string
     */
    public $industryPhyCode;

    // 行业门类名称
    /**
     * @var string
     */
    public $industryPhyName;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'signature'       => 'signature',
        'industryCode'    => 'industry_code',
        'industryName'    => 'industry_name',
        'industryPhyCode' => 'industry_phy_code',
        'industryPhyName' => 'industry_phy_name',
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
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->industryCode) {
            $res['industry_code'] = $this->industryCode;
        }
        if (null !== $this->industryName) {
            $res['industry_name'] = $this->industryName;
        }
        if (null !== $this->industryPhyCode) {
            $res['industry_phy_code'] = $this->industryPhyCode;
        }
        if (null !== $this->industryPhyName) {
            $res['industry_phy_name'] = $this->industryPhyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEnterpriseBusinessinfoResponse
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
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['industry_code'])) {
            $model->industryCode = $map['industry_code'];
        }
        if (isset($map['industry_name'])) {
            $model->industryName = $map['industry_name'];
        }
        if (isset($map['industry_phy_code'])) {
            $model->industryPhyCode = $map['industry_phy_code'];
        }
        if (isset($map['industry_phy_name'])) {
            $model->industryPhyName = $map['industry_phy_name'];
        }

        return $model;
    }
}

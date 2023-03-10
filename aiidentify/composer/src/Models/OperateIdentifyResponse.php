<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class OperateIdentifyResponse extends Model
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

    // 鉴定单编号
    /**
     * @var string
     */
    public $identifyNumber;

    // 品类名称
    /**
     * @var string
     */
    public $categoryName;

    // 品牌名称
    /**
     * @var string
     */
    public $brandName;

    // 款式名称
    /**
     * @var string
     */
    public $styleName;

    // 整体鉴定结果
    // SUCCESS：符合鉴定标准
    // FAILED：不符合鉴定标准
    // NOT_IDENTIFY：无法鉴定
    /**
     * @var string
     */
    public $identifyResult;

    // 鉴定描述
    /**
     * @var string
     */
    public $identifyDesc;

    // 鉴定点结果列表
    /**
     * @var IdentifyPointResultResp[]
     */
    public $identifyPointResultList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'identifyNumber'          => 'identify_number',
        'categoryName'            => 'category_name',
        'brandName'               => 'brand_name',
        'styleName'               => 'style_name',
        'identifyResult'          => 'identify_result',
        'identifyDesc'            => 'identify_desc',
        'identifyPointResultList' => 'identify_point_result_list',
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
        if (null !== $this->identifyNumber) {
            $res['identify_number'] = $this->identifyNumber;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->styleName) {
            $res['style_name'] = $this->styleName;
        }
        if (null !== $this->identifyResult) {
            $res['identify_result'] = $this->identifyResult;
        }
        if (null !== $this->identifyDesc) {
            $res['identify_desc'] = $this->identifyDesc;
        }
        if (null !== $this->identifyPointResultList) {
            $res['identify_point_result_list'] = [];
            if (null !== $this->identifyPointResultList && \is_array($this->identifyPointResultList)) {
                $n = 0;
                foreach ($this->identifyPointResultList as $item) {
                    $res['identify_point_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIdentifyResponse
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
        if (isset($map['identify_number'])) {
            $model->identifyNumber = $map['identify_number'];
        }
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['style_name'])) {
            $model->styleName = $map['style_name'];
        }
        if (isset($map['identify_result'])) {
            $model->identifyResult = $map['identify_result'];
        }
        if (isset($map['identify_desc'])) {
            $model->identifyDesc = $map['identify_desc'];
        }
        if (isset($map['identify_point_result_list'])) {
            if (!empty($map['identify_point_result_list'])) {
                $model->identifyPointResultList = [];
                $n                              = 0;
                foreach ($map['identify_point_result_list'] as $item) {
                    $model->identifyPointResultList[$n++] = null !== $item ? IdentifyPointResultResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

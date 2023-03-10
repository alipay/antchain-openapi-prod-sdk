<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class QueryIdentifypointResponse extends Model
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

    // 款式编号
    /**
     * @var string
     */
    public $styleCode;

    // 至少上传鉴定点数量
    /**
     * @var int
     */
    public $atLeastNum;

    // 鉴定点信息列表
    /**
     * @var IdentifyPointResp[]
     */
    public $identifyPointList;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'categoryName'      => 'category_name',
        'brandName'         => 'brand_name',
        'styleName'         => 'style_name',
        'styleCode'         => 'style_code',
        'atLeastNum'        => 'at_least_num',
        'identifyPointList' => 'identify_point_list',
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
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->styleName) {
            $res['style_name'] = $this->styleName;
        }
        if (null !== $this->styleCode) {
            $res['style_code'] = $this->styleCode;
        }
        if (null !== $this->atLeastNum) {
            $res['at_least_num'] = $this->atLeastNum;
        }
        if (null !== $this->identifyPointList) {
            $res['identify_point_list'] = [];
            if (null !== $this->identifyPointList && \is_array($this->identifyPointList)) {
                $n = 0;
                foreach ($this->identifyPointList as $item) {
                    $res['identify_point_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdentifypointResponse
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
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['style_name'])) {
            $model->styleName = $map['style_name'];
        }
        if (isset($map['style_code'])) {
            $model->styleCode = $map['style_code'];
        }
        if (isset($map['at_least_num'])) {
            $model->atLeastNum = $map['at_least_num'];
        }
        if (isset($map['identify_point_list'])) {
            if (!empty($map['identify_point_list'])) {
                $model->identifyPointList = [];
                $n                        = 0;
                foreach ($map['identify_point_list'] as $item) {
                    $model->identifyPointList[$n++] = null !== $item ? IdentifyPointResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

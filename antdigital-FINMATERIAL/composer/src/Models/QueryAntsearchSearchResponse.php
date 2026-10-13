<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\FINMATERIAL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\FINMATERIAL\Models\ResponseMetadata;
use AntChain\FINMATERIAL\Models\Result;
use AntChain\FINMATERIAL\Models\IndustryDataItem;

class QueryAntsearchSearchResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'responseMetadata' => 'response_metadata',
        'result' => 'result',
        'industryData' => 'industry_data',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->responseMetadata) {
            $res['response_metadata'] = null !== $this->responseMetadata ? $this->responseMetadata->toMap() : null;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }
        if (null !== $this->industryData) {
            $res['industry_data'] = [];
            if(null !== $this->industryData && is_array($this->industryData)){
                $n = 0;
                foreach($this->industryData as $item){
                    $res['industry_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntsearchSearchResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['response_metadata'])){
            $model->responseMetadata = ResponseMetadata::fromMap($map['response_metadata']);
        }
        if(isset($map['result'])){
            $model->result = Result::fromMap($map['result']);
        }
        if(isset($map['industry_data'])){
            if(!empty($map['industry_data'])){
                $model->industryData = [];
                $n = 0;
                foreach($map['industry_data'] as $item) {
                    $model->industryData[$n++] = null !== $item ? IndustryDataItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
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

    // 统一响应元信息
    /**
     * @var ResponseMetadata
     */
    public $responseMetadata;

    // 本次的搜索结果
    /**
     * @var Result
     */
    public $result;

    // 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
    /**
     * @var IndustryDataItem[]
     */
    public $industryData;

}

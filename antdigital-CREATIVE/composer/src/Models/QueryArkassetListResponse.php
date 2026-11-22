<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class QueryArkassetListResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'responseBody' => 'response_body',
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
        if (null !== $this->responseBody) {
            $res['response_body'] = $this->responseBody;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryArkassetListResponse
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
        if(isset($map['response_body'])){
            $model->responseBody = $map['response_body'];
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

    // {"ResponseMetadata":{"RequestId":"202405142130001A2B3C4D5E6F708192","Action":"ListAssets","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Items":[{"Id":"asset-20240514212750-a3f8k","Name":"demo-portrait-image","URL":"https://ark-asset.cn-beijing.volcengine.com/asset-20240514212750-a3f8k.jpg?X-Amz-Expires=43200","GroupId":"group-20240514212750-b5e9m","AssetType":"Image","Status":"Active","Moderation":{"Strategy":"Default"},"Error":{"Code":"","Message":""},"ProjectName":"default","CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z","LastInferenceTime":"2024-05-14T22:15:30Z"}],"NextToken":"****bmNyeXB0ZWRfY3Vyc29yIjoiLi4****"}}
    /**
     * @var string
     */
    public $responseBody;

}

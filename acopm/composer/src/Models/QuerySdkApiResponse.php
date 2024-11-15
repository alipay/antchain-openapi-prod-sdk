<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QuerySdkApiResponse extends Model
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

    // 当前版本sdk包含api信息列表
    /**
     * @var ApiInfoModel[]
     */
    public $apiInfoModels;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'apiInfoModels' => 'api_info_models',
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
        if (null !== $this->apiInfoModels) {
            $res['api_info_models'] = [];
            if (null !== $this->apiInfoModels && \is_array($this->apiInfoModels)) {
                $n = 0;
                foreach ($this->apiInfoModels as $item) {
                    $res['api_info_models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySdkApiResponse
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
        if (isset($map['api_info_models'])) {
            if (!empty($map['api_info_models'])) {
                $model->apiInfoModels = [];
                $n                    = 0;
                foreach ($map['api_info_models'] as $item) {
                    $model->apiInfoModels[$n++] = null !== $item ? ApiInfoModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

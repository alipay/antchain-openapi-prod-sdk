<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryContentBatchstatisticsResponse extends Model
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

    // 出海视频统计数据列表
    /**
     * @var OverseaContentStatistics[]
     */
    public $overseaContentStatisticsList;
    protected $_name = [
        'reqMsgId'                     => 'req_msg_id',
        'resultCode'                   => 'result_code',
        'resultMsg'                    => 'result_msg',
        'overseaContentStatisticsList' => 'oversea_content_statistics_list',
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
        if (null !== $this->overseaContentStatisticsList) {
            $res['oversea_content_statistics_list'] = [];
            if (null !== $this->overseaContentStatisticsList && \is_array($this->overseaContentStatisticsList)) {
                $n = 0;
                foreach ($this->overseaContentStatisticsList as $item) {
                    $res['oversea_content_statistics_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContentBatchstatisticsResponse
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
        if (isset($map['oversea_content_statistics_list'])) {
            if (!empty($map['oversea_content_statistics_list'])) {
                $model->overseaContentStatisticsList = [];
                $n                                   = 0;
                foreach ($map['oversea_content_statistics_list'] as $item) {
                    $model->overseaContentStatisticsList[$n++] = null !== $item ? OverseaContentStatistics::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryContainerserviceResponse extends Model
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

    // 容器应用服务列表。
    /**
     * @var ContainerServiceBasicInfo[]
     */
    public $containerServiceList;

    // 实例列表的页码。
    /**
     * @var int
     */
    public $pageNumber;

    // 输入时设置的每页行数。
    /**
     * @var int
     */
    public $pageSize;

    // 查询到的容器应用服务总数。
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'containerServiceList' => 'container_service_list',
        'pageNumber'           => 'page_number',
        'pageSize'             => 'page_size',
        'totalCount'           => 'total_count',
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
        if (null !== $this->containerServiceList) {
            $res['container_service_list'] = [];
            if (null !== $this->containerServiceList && \is_array($this->containerServiceList)) {
                $n = 0;
                foreach ($this->containerServiceList as $item) {
                    $res['container_service_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContainerserviceResponse
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
        if (isset($map['container_service_list'])) {
            if (!empty($map['container_service_list'])) {
                $model->containerServiceList = [];
                $n                           = 0;
                foreach ($map['container_service_list'] as $item) {
                    $model->containerServiceList[$n++] = null !== $item ? ContainerServiceBasicInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}

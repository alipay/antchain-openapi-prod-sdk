<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class MCPServerQueryPageGatewayRequest extends Model
{
    // 空间id
    /**
     * @example 123
     *
     * @var string
     */
    public $spaceId;

    // 运行模式
    /**
     * @example null
     *
     * @var string
     */
    public $runMode;

    // 来源
    /**
     * @example all
     *
     * @var string
     */
    public $source;

    // 查询条件
    /**
     * @example 测试
     *
     * @var string
     */
    public $query;

    // 页码
    /**
     * @example
     *
     * @var int
     */
    public $pageNum;

    // 分页大小
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'spaceId'  => 'space_id',
        'runMode'  => 'run_mode',
        'source'   => 'source',
        'query'    => 'query',
        'pageNum'  => 'page_num',
        'pageSize' => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->runMode) {
            $res['run_mode'] = $this->runMode;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MCPServerQueryPageGatewayRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['run_mode'])) {
            $model->runMode = $map['run_mode'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}

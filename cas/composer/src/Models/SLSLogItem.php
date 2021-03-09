<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SLSLogItem extends Model
{
    // 日志的时间戳（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
    /**
     * @example 1409529660
     *
     * @var int
     */
    public $logTime;

    // 日志的来源，写入日志时指定。
    /**
     * @example 10.237.0.17
     *
     * @var string
     */
    public $source;

    // 日志原始内容
    /**
     * @example
     *
     * @var SLSLogContent[]
     */
    public $contents;
    protected $_name = [
        'logTime'  => 'log_time',
        'source'   => 'source',
        'contents' => 'contents',
    ];

    public function validate()
    {
        Model::validateRequired('logTime', $this->logTime, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('contents', $this->contents, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->logTime) {
            $res['log_time'] = $this->logTime;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->contents) {
            $res['contents'] = [];
            if (null !== $this->contents && \is_array($this->contents)) {
                $n = 0;
                foreach ($this->contents as $item) {
                    $res['contents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SLSLogItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['log_time'])) {
            $model->logTime = $map['log_time'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['contents'])) {
            if (!empty($map['contents'])) {
                $model->contents = [];
                $n               = 0;
                foreach ($map['contents'] as $item) {
                    $model->contents[$n++] = null !== $item ? SLSLogContent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

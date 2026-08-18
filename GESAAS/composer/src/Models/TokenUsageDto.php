<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\ToolUsage;

class TokenUsageDto extends Model {
    protected $_name = [
        'completionTokens' => 'completion_tokens',
        'totalTokens' => 'total_tokens',
        'toolUsage' => 'tool_usage',
    ];
    public function validate() {
        Model::validateRequired('completionTokens', $this->completionTokens, true);
        Model::validateRequired('totalTokens', $this->totalTokens, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->completionTokens) {
            $res['completion_tokens'] = $this->completionTokens;
        }
        if (null !== $this->totalTokens) {
            $res['total_tokens'] = $this->totalTokens;
        }
        if (null !== $this->toolUsage) {
            $res['tool_usage'] = null !== $this->toolUsage ? $this->toolUsage->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TokenUsageDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['completion_tokens'])){
            $model->completionTokens = $map['completion_tokens'];
        }
        if(isset($map['total_tokens'])){
            $model->totalTokens = $map['total_tokens'];
        }
        if(isset($map['tool_usage'])){
            $model->toolUsage = ToolUsage::fromMap($map['tool_usage']);
        }
        return $model;
    }
    // 生成视频消耗的 token 数
    /**
     * @example 235436757
     * @var int
     */
    public $completionTokens;

    // 消耗总 token 数
    /**
     * @example 235436546
     * @var int
     */
    public $totalTokens;

    // 工具用量
    /**
     * @example undefined
     * @var ToolUsage
     */
    public $toolUsage;

}

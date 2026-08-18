<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class ToolUsage extends Model {
    protected $_name = [
        'webSearch' => 'web_search',
    ];
    public function validate() {
        Model::validateRequired('webSearch', $this->webSearch, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->webSearch) {
            $res['web_search'] = $this->webSearch;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ToolUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['web_search'])){
            $model->webSearch = $map['web_search'];
        }
        return $model;
    }
    // 联网搜索调用次数
    /**
     * @example 1
     * @var int
     */
    public $webSearch;

}

<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UniversalBodyCmd extends Model
{
    // body
    /**
     * @example body
     *
     * @var string
     */
    public $body;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // model_name
    /**
     * @example model_name
     *
     * @var string
     */
    public $modelName;

    // op
    /**
     * @example op
     *
     * @var string
     */
    public $op;

    // parse_long_text
    /**
     * @example true,false
     *
     * @var bool
     */
    public $parseLongText;

    // page_size
    /**
     * @example page_size
     *
     * @var int
     */
    public $pageSize;

    // page_index
    /**
     * @example page_index
     *
     * @var int
     */
    public $pageIndex;

    // cur_index
    /**
     * @example cur_index
     *
     * @var int
     */
    public $curIndex;
    protected $_name = [
        'body'          => 'body',
        'id'            => 'id',
        'modelName'     => 'model_name',
        'op'            => 'op',
        'parseLongText' => 'parse_long_text',
        'pageSize'      => 'page_size',
        'pageIndex'     => 'page_index',
        'curIndex'      => 'cur_index',
    ];

    public function validate()
    {
        Model::validateRequired('body', $this->body, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('op', $this->op, true);
        Model::validateRequired('parseLongText', $this->parseLongText, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('curIndex', $this->curIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->op) {
            $res['op'] = $this->op;
        }
        if (null !== $this->parseLongText) {
            $res['parse_long_text'] = $this->parseLongText;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->curIndex) {
            $res['cur_index'] = $this->curIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UniversalBodyCmd
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['op'])) {
            $model->op = $map['op'];
        }
        if (isset($map['parse_long_text'])) {
            $model->parseLongText = $map['parse_long_text'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['cur_index'])) {
            $model->curIndex = $map['cur_index'];
        }

        return $model;
    }
}

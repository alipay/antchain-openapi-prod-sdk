<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightContractInterfaceArgument extends Model
{
    // 参数名
    /**
     * @example arg0
     *
     * @var string
     */
    public $name;

    // 参数类型
    /**
     * @example String
     *
     * @var string
     */
    public $type;

    // 参数位置，枚举：input，output，deposit
    /**
     * @example input
     *
     * @var string
     */
    public $location;

    // 参数的业务名称
    /**
     * @example 商品名称
     *
     * @var string
     */
    public $comment;

    // 用于在更新参数配置时，声明是否需要删除该参数的 comment 内容
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleteComment;

    // 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
    /**
     * @example operator
     *
     * @var string
     */
    public $standardErcName;

    // 是否进行数据脱敏
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needDesensitization;

    // 子参数列表
    /**
     * @example
     *
     * @var ChainInsightContractInterfaceArgumentList
     */
    public $subArgs;
    protected $_name = [
        'name'                => 'name',
        'type'                => 'type',
        'location'            => 'location',
        'comment'             => 'comment',
        'deleteComment'       => 'delete_comment',
        'standardErcName'     => 'standard_erc_name',
        'needDesensitization' => 'need_desensitization',
        'subArgs'             => 'sub_args',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('location', $this->location, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->deleteComment) {
            $res['delete_comment'] = $this->deleteComment;
        }
        if (null !== $this->standardErcName) {
            $res['standard_erc_name'] = $this->standardErcName;
        }
        if (null !== $this->needDesensitization) {
            $res['need_desensitization'] = $this->needDesensitization;
        }
        if (null !== $this->subArgs) {
            $res['sub_args'] = null !== $this->subArgs ? $this->subArgs->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightContractInterfaceArgument
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['delete_comment'])) {
            $model->deleteComment = $map['delete_comment'];
        }
        if (isset($map['standard_erc_name'])) {
            $model->standardErcName = $map['standard_erc_name'];
        }
        if (isset($map['need_desensitization'])) {
            $model->needDesensitization = $map['need_desensitization'];
        }
        if (isset($map['sub_args'])) {
            $model->subArgs = ChainInsightContractInterfaceArgumentList::fromMap($map['sub_args']);
        }

        return $model;
    }
}

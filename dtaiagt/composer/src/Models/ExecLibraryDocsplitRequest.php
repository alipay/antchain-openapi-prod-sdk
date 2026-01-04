<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ExecLibraryDocsplitRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 知识库ID
    /**
     * @var int
     */
    public $libraryId;

    // 使用的切分器名称
    /**
     * @var string
     */
    public $splitter;

    // 切片类型
    /**
     * @var string
     */
    public $sectionType;

    // 切分字数（智能分片/按规则分片）
    /**
     * @var int
     */
    public $chunkSize;

    // 块之间的最大重叠字符数（智能分片）
    /**
     * @var int
     */
    public $chunkOverlap;

    // 最小标题级别，0为全部拍平（智能分片）
    /**
     * @var int
     */
    public $minLeve;

    // 自定义切分规则正则表达式（按规则分片）
    /**
     * @var string
     */
    public $regex;

    // 任务名称
    /**
     * @var string
     */
    public $taskName;

    // 文件信息列表
    /**
     * @var FileReq[]
     */
    public $files;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'libraryId'         => 'library_id',
        'splitter'          => 'splitter',
        'sectionType'       => 'section_type',
        'chunkSize'         => 'chunk_size',
        'chunkOverlap'      => 'chunk_overlap',
        'minLeve'           => 'min_leve',
        'regex'             => 'regex',
        'taskName'          => 'task_name',
        'files'             => 'files',
    ];

    public function validate()
    {
        Model::validateRequired('libraryId', $this->libraryId, true);
        Model::validateRequired('splitter', $this->splitter, true);
        Model::validateRequired('sectionType', $this->sectionType, true);
        Model::validateRequired('chunkSize', $this->chunkSize, true);
        Model::validateRequired('chunkOverlap', $this->chunkOverlap, true);
        Model::validateRequired('regex', $this->regex, true);
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('files', $this->files, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->splitter) {
            $res['splitter'] = $this->splitter;
        }
        if (null !== $this->sectionType) {
            $res['section_type'] = $this->sectionType;
        }
        if (null !== $this->chunkSize) {
            $res['chunk_size'] = $this->chunkSize;
        }
        if (null !== $this->chunkOverlap) {
            $res['chunk_overlap'] = $this->chunkOverlap;
        }
        if (null !== $this->minLeve) {
            $res['min_leve'] = $this->minLeve;
        }
        if (null !== $this->regex) {
            $res['regex'] = $this->regex;
        }
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
        }
        if (null !== $this->files) {
            $res['files'] = [];
            if (null !== $this->files && \is_array($this->files)) {
                $n = 0;
                foreach ($this->files as $item) {
                    $res['files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecLibraryDocsplitRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['splitter'])) {
            $model->splitter = $map['splitter'];
        }
        if (isset($map['section_type'])) {
            $model->sectionType = $map['section_type'];
        }
        if (isset($map['chunk_size'])) {
            $model->chunkSize = $map['chunk_size'];
        }
        if (isset($map['chunk_overlap'])) {
            $model->chunkOverlap = $map['chunk_overlap'];
        }
        if (isset($map['min_leve'])) {
            $model->minLeve = $map['min_leve'];
        }
        if (isset($map['regex'])) {
            $model->regex = $map['regex'];
        }
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
        }
        if (isset($map['files'])) {
            if (!empty($map['files'])) {
                $model->files = [];
                $n            = 0;
                foreach ($map['files'] as $item) {
                    $model->files[$n++] = null !== $item ? FileReq::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}

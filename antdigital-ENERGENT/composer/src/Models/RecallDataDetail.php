<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class RecallDataDetail extends Model {
    protected $_name = [
        'docname' => 'docname',
        'content' => 'content',
        'rerankscore' => 'rerankscore',
        'rerankrank' => 'rerankrank',
        'score' => 'score',
        'title' => 'title',
        'knowledgebaseids' => 'knowledgebaseids',
        'knowledgebasetag' => 'knowledgebasetag',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->docname) {
            $res['docname'] = $this->docname;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->rerankscore) {
            $res['rerankscore'] = $this->rerankscore;
        }
        if (null !== $this->rerankrank) {
            $res['rerankrank'] = $this->rerankrank;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->knowledgebaseids) {
            $res['knowledgebaseids'] = $this->knowledgebaseids;
        }
        if (null !== $this->knowledgebasetag) {
            $res['knowledgebasetag'] = $this->knowledgebasetag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RecallDataDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['docname'])){
            $model->docname = $map['docname'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['rerankscore'])){
            $model->rerankscore = $map['rerankscore'];
        }
        if(isset($map['rerankrank'])){
            $model->rerankrank = $map['rerankrank'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['knowledgebaseids'])){
            $model->knowledgebaseids = $map['knowledgebaseids'];
        }
        if(isset($map['knowledgebasetag'])){
            $model->knowledgebasetag = $map['knowledgebasetag'];
        }
        return $model;
    }
    // 文件名
    /**
     * @example 浙江省电力交易细则
     * @var string
     */
    public $docname;

    // 片段内容
    /**
     * @example 浙江省交易细则
     * @var string
     */
    public $content;

    // 重排得分
    /**
     * @example 1.2
     * @var int
     */
    public $rerankscore;

    // 重排位次
    /**
     * @example 1
     * @var int
     */
    public $rerankrank;

    // 综合得分
    /**
     * @example 1
     * @var int
     */
    public $score;

    // chunk标题
    /**
     * @example 浙江省交易细则
     * @var string
     */
    public $title;

    // 知识库id
    /**
     * @example 1
     * @var string
     */
    public $knowledgebaseids;

    // official 官方知识库、custom个人知识库
    /**
     * @example official
     * @var string
     */
    public $knowledgebasetag;

}
